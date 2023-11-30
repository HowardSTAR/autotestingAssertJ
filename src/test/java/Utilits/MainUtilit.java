package Utilits;

import org.assertj.swing.fixture.FrameFixture;
import org.example.MainApp;

public class MainUtilit {

    private FrameFixture window;

    public FrameFixture setUp() {
        MainApp mainApp = new MainApp();
        window = new FrameFixture(mainApp);
        window.show();
        return window;
    }

    public void tearDown() {
        window.cleanUp();
    }
}