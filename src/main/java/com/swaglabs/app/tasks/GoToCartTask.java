package com.swaglabs.app.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.swaglabs.app.userinterfaces.SelectProductInterface.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToCartTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_GO_CART)
        );
    }
    public static GoToCartTask goCart(){
        return instrumented(GoToCartTask.class);
    }
}
