package pageObjects;

import org.openqa.selenium.By;

public class AdminPage extends BasePage{

    private static final By APPLICATION_MANAGEMENT_BUTTON = By.linkText("Applications Management");

    public void goToApplicationManagement() {
        driver.findElement(APPLICATION_MANAGEMENT_BUTTON).click();
    }
}
