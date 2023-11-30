package Utilits;

import org.junit.After;
import org.junit.Before;

public class TestSetup {

    private MainUtilit mainAppFixture;

    @Before
    public void setUp() {
        mainAppFixture = new MainUtilit();
        mainAppFixture.setUp();
    }

    @After
    public void tearDown() {
        mainAppFixture.tearDown();
    }
}