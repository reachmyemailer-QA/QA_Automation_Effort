package PageStepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import BaseClasses.*;

public class Hooks {

    @Before
    public void setUp() {

        Base.initializeBrowser();

    }

    @After
    public void tearDown() {

        Base.quitBrowser();

    }

}