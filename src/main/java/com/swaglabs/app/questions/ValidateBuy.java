package com.swaglabs.app.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.swaglabs.app.userinterfaces.OverviewCartInterface.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ValidateBuy implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(MSM_THANKS, WebElementStateMatchers.isPresent()).forNoMoreThan(15).seconds());
        return the(MSM_THANKS).answeredBy(actor).isVisible();
    }
    public static ValidateBuy seeMsmSuccessful() {
        return new ValidateBuy();
    }
}
