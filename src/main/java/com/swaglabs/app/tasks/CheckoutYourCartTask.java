package com.swaglabs.app.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.swaglabs.app.userinterfaces.SelectProductInterface.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CheckoutYourCartTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_CHECKOUT, WebElementStateMatchers.isVisible()).forNoMoreThan(15).seconds(),
                Click.on(BTN_CHECKOUT)
        );
    }
    public static CheckoutYourCartTask checkCart(){
        return instrumented(CheckoutYourCartTask.class);
    }
}
