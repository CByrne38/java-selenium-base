package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private static final String URL = "https://d2vo1vcw0l31zb.cloudfront.net/";
    private static final By LOGIN_BUTTON = By.cssSelector("h1 + a");
    private static final By LOGGED_IN_USER = By.cssSelector("#navbar-links span");
    private static final By ADMIN_BUTTON = By.linkText("Admin");

    public void goTo() {
        driver.get(URL);
    }

    public void goToLoginPage() {
        driver.findElement(LOGIN_BUTTON).click();
    }

    public String getUserLoggedIn() {

        String user;
        try {
            user = driver.findElement(LOGGED_IN_USER).getText();
        } catch (Exception e) {
            return "NULL";
        }
        return user;
    }

    public void goToApplyPage() {
        driver.findElement(By.linkText("Apply")).click();
    }

    public void goToAdminPage() {
        driver.findElement(ADMIN_BUTTON).click();
    }


    private boolean loggedIn;

    public boolean isLoggedOut() {
        return !loggedIn;
    }
}
