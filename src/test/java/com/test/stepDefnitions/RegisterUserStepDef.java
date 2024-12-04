package com.test.stepDefnitions;

import com.test.Task.agregararreglo;
import com.test.Task.llenarformulario;
import com.test.interactions.OpenBrowser;
import io.cucumber.java.en.*;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterUserStepDef {

    @Given("user open the url sanangel.com")
    public void userOpenTheUrlSanangelCom() {
        theActorCalled("user")
                .attemptsTo(
                        OpenBrowser.cargarNavegador()
                );

    }

    @When("user add one pack flower")
    public void userAddOnePackFlower() {
        theActorInTheSpotlight().attemptsTo(
                agregararreglo.on(),
                llenarformulario.on()
        );



    }

    @Then("this permit add to cart")
    public void thisPermitAddToCart() {
    }
}
