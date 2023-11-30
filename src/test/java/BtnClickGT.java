import Utilits.TestSetup;
import org.assertj.swing.finder.WindowFinder;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.fixture.JButtonFixture;
import org.assertj.swing.fixture.JOptionPaneFixture;
import org.assertj.swing.core.Robot;
import org.junit.Test;

import java.util.Objects;

public class BtnClickGT extends TestSetup {
    private FrameFixture window = new FrameFixture(mainApp);;

    @Test
    public void testButtonClick() {
        // Находим кнопку по тексту
        JButtonFixture button = window.button("Нажми меня");
        JButtonFixture buttonFixture =

        // Кликаем по кнопке
        button.click();

        // Проверяем, что появилось диалоговое окно
        JOptionPaneFixture optionPane = JOptionPaneFinder.findOptionPane().using(window.robot());
        assertThat(optionPane).isNotNull();

        // Проверяем текст в диалоговом окне
        assertThat(optionPane.label().text()).isEqualTo("Привет, это Swing!");

        // Закрываем диалоговое окно
        optionPane.buttonWithText("OK").click();
    }

    // Класс для поиска диалогового окна с использованием AssertJ Swing
    private static class JOptionPaneFinder {
        static JOptionPaneFixture findOptionPane() {
            return new JOptionPaneFixture(Objects.requireNonNull(WindowFinder.findFrame(new GenericTypeMatcher<JFrame>(JFrame.class) {
                @Override
                protected boolean isMatching(JFrame frame) {
                    return frame.isVisible() && "OptionPane.frameForJOptionPane".equals(frame.getName());
                }
            }).using(null).usingDefaultDialogFinder()));
        }
    }
}
}