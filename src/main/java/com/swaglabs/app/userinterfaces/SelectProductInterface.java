package com.swaglabs.app.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SelectProductInterface extends PageObject {

    public static final Target BTN_GO_CART = Target.the("Go to cart").located(By.xpath("(//*[@clickable='true'])[2]"));
    public static final Target TXT_YOUR_CART = Target.the("Validate shopping cart").located(By.xpath("//*[@text='TU CARRITO']"));
    public static final Target BTN_CHECKOUT = Target.the("Field user").located(By.xpath("//*[@text='CHECKOUT']"));

    public static Target BTN_SELECT_PRODUCT () {
        return Target.the("Select product one").locatedBy("(//*[@class='android.view.ViewGroup'] //*[@class='android.widget.TextView' and contains(@text, '{0}')]//.//..//.//*[contains(@text, 'A CARRITO')])[1]");
    }
}
