package com.swaglabs.app.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BuyAppUserInterFace extends PageObject {

    public static final Target TXT_USER = Target.the("Field user").located(By.xpath("//*[@text='Usuario']"));
    public static final Target TXT_PASSWORD = Target.the("Field password").located(By.xpath("(//*[@class='android.widget.EditText'])[2]"));
    public static final Target BTN_LOGIN = Target.the("Field password").located(By.xpath("//*[@text='LOGIN']"));
    public static final Target TXT_PRODUCTS = Target.the("Field password").located(By.xpath("//*[@text='PRODUCTOS']"));
}
