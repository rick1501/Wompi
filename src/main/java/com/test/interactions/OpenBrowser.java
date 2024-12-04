package com.test.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBrowser implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(
                    Open.url("https://sanangel.com.co/")
            );

    }

    public static OpenBrowser cargarNavegador() {
        return Instrumented.instanceOf(OpenBrowser.class).withProperties();
    }
}
