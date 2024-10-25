package com.swaglabs.app.drivers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverAppium {
    public static AppiumDriver<MobileElement> driver;

    public static DriverAppium yourBrowser(){
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName","23013PC75G");
            capabilities.setCapability("platformName","ANDROID");
            capabilities.setCapability("appPackage","com.swaglabsmobileapp");
            capabilities.setCapability("appActivity","com.swaglabsmobileapp.SplashActivity");
            capabilities.setCapability("noReset","false");
            capabilities.setCapability("platformVersion","14");
            capabilities.setCapability("noSign", "true");
            capabilities.setCapability("automationName", "uiautomator2");

            driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return new DriverAppium();
    }

    public AppiumDriver<MobileElement> on(){
        return driver;
    }
}
