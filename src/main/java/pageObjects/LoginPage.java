package pageObjects;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    private static final By USERNAME_INPUT = By.id("formBasicUsername");
    private static final By PASSWORD_INPUT = By.id("formBasicPassword");
    private static final By SUBMIT_BUTTON = By.cssSelector("form button");
    private static final By ALERT = By.className("alert");

    public void login(String user, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(user);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(SUBMIT_BUTTON).click();
    }

    public String getError() {
        return driver.findElement(ALERT).getText();
    }
}
