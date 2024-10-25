package com.swaglabs.app.tasks;

import com.swaglabs.app.models.FillFormModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.swaglabs.app.userinterfaces.FillFormInterface.*;

public class FillFormTask implements Task {

    private String name;
    private String lastName;
    private String cod;

    public FillFormTask(FillFormModel fillFormModal) {
        this.name = fillFormModal.getName();
        this.lastName = fillFormModal.getLastName();
        this.cod = fillFormModal.getCod();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_FIRST_NAME, WebElementStateMatchers.isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue(name).into(TXT_FIRST_NAME),
                Enter.theValue(lastName).into(TXT_LAST_NAME),
                Enter.theValue(cod).into(TXT_POSTAL_CODE),
                Click.on(BTN_CONTINUE)
        );
    }

    public static FillFormTask personalData(FillFormModel fillFormModal){
        return Tasks.instrumented(FillFormTask.class,fillFormModal);
    }
}
