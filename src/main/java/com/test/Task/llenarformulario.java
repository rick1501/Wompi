package com.test.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.test.UI.ingresodatos.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class llenarformulario implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("ricardo").into(FIRST_NAME_FIELD),
                Enter.theValue("Testing").into(LAST_NAME_FIELD),
                Enter.theValue("1072643613").into(CEDULA),
                Enter.theValue("pruebas@gmail.com").into(EMAIL_FIELD),
                Enter.theValue("3162187478").into(MOBILE_FIELD),
                Click.on(BTNCANT),
                Click.on(BTNADD2)


        );
    }
    public static llenarformulario on (){
        return instrumented(llenarformulario.class);
    }
}
