package com.swaglabs.app.tasks;

import com.swaglabs.app.models.DataLoginModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.swaglabs.app.userinterfaces.BuyAppUserInterFace.*;

public class LoginPageTask implements Task {

    private String user;
    private String password;

    public LoginPageTask(DataLoginModel loginModel) {
        this.user = loginModel.getUser();
        this.password = loginModel.getPassword();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_USER, WebElementStateMatchers.isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue(user).into(TXT_USER),
                Enter.theValue(password).into(TXT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }
    public static LoginPageTask enterCredentials(DataLoginModel loginModel){
        return Tasks.instrumented(LoginPageTask.class,loginModel);
    }
}
