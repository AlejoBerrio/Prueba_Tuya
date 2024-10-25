package com.swaglabs.app.tasks;

import com.swaglabs.app.models.DataLoginModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.swaglabs.app.userinterfaces.SelectProductInterface.*;

public class SelectProductTask implements Task {

    private String product;

    public SelectProductTask (DataLoginModel dataLoginModel) {
        this.product = dataLoginModel.getProduct();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SELECT_PRODUCT().of(product))
        );
    }
    public static SelectProductTask selectProducts(DataLoginModel dataLoginModel){
        return Tasks.instrumented(SelectProductTask.class,dataLoginModel);
    }
}
