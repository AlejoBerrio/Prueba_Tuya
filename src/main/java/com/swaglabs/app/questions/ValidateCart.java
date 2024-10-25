package com.swaglabs.app.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.swaglabs.app.userinterfaces.SelectProductInterface.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ValidateCart implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_YOUR_CART, WebElementStateMatchers.isPresent()).forNoMoreThan(15).seconds());
        return the(TXT_YOUR_CART).answeredBy(actor).isVisible();
    }
    public static ValidateCart seeCart() {
        return new ValidateCart();
    }
}
