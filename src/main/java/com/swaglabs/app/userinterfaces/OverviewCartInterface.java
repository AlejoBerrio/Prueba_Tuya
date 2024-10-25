package com.swaglabs.app.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class OverviewCartInterface extends PageObject {

    public static final Target TXT_TITLE_OVERVIEW = Target.the("Title Overview").located(By.xpath("//*[@text='CHECKOUT: RESUMEN']"));
    public static final Target BTN_FINISH = Target.the("Button to finish").located(By.xpath("//*[@text='TERMINAR']"));
    public static final Target MSM_THANKS = Target.the("Message Successful buy").located(By.xpath("//*[@text='GRACIAS POR SU ORDEN']"));
}
