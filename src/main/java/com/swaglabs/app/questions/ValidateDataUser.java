package com.swaglabs.app.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.swaglabs.app.userinterfaces.OverviewCartInterface.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ValidateDataUser implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_TITLE_OVERVIEW, WebElementStateMatchers.isPresent()).forNoMoreThan(15).seconds());
        return the(TXT_TITLE_OVERVIEW).answeredBy(actor).isVisible();
    }
    public static ValidateDataUser insertData() {
        return new ValidateDataUser();
    }
}
