package com.swaglabs.app.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FillFormInterface extends PageObject {

    public static final Target TXT_FIRST_NAME = Target.the("Field first name").located(By.xpath("//*[@text='Nombre']"));
    public static final Target TXT_LAST_NAME = Target.the("Field last name").located(By.xpath("//*[@text='Apellido']"));
    public static final Target TXT_POSTAL_CODE = Target.the("Field postal code").located(By.xpath("//*[contains(@text, 'postal')]"));
    public static final Target BTN_CONTINUE = Target.the("Button continue").located(By.xpath("//*[@text='CONTINUAR']"));
}
