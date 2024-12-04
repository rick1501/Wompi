package com.test.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.test.UI.flores.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class agregararreglo implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(BTNMAS),
                Click.on(BTNADDTOCART)

        );
    }
    public static agregararreglo on (){
        return instrumented(agregararreglo.class);
    }

}
