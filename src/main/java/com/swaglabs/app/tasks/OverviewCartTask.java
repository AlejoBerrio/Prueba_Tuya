package com.swaglabs.app.tasks;

import com.swaglabs.app.drivers.DriverAppium;
import io.appium.java_client.android.AndroidElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.swaglabs.app.userinterfaces.OverviewCartInterface.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OverviewCartTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(TXT_TITLE_OVERVIEW, WebElementStateMatchers.isVisible()).forNoMoreThan(15).seconds(),
                Click.on(BTN_FINISH)
        );
    }
    public static OverviewCartTask finish(){
        return instrumented(OverviewCartTask.class);
    }
}
