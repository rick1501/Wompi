package com.test.stepDefnitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static com.test.utils.DriverFactory.getDriver;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class Hooks {

    @Managed
    WebDriver driver;

    @Before
    public void setUp(){
        driver= getDriver();
        setTheStage(new OnlineCast());
        theActorCalled("user")
                .whoCan(BrowseTheWeb.with(driver));
    }
}
