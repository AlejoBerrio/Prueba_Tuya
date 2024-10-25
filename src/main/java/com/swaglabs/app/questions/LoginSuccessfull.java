package com.swaglabs.app.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.swaglabs.app.userinterfaces.BuyAppUserInterFace.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class LoginSuccessfull implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_PRODUCTS, WebElementStateMatchers.isPresent()).forNoMoreThan(15).seconds());
        return the(TXT_PRODUCTS).answeredBy(actor).isVisible();
    }
    public static LoginSuccessfull seesProducts() {
        return new LoginSuccessfull();
    }
}
