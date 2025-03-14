package pageObjects;

import config.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {

    protected WebDriver driver = WebDriverManager.getDriver();
    protected Actions actions;
    protected WebDriverWait wait;
    private static final By LOGOUT_BUTTON = By.cssSelector("#navbar-links > div a");

    public BasePage(){
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void logout() {

        wait.until(d -> {
            try {
                WebElement logout = d.findElement(LOGOUT_BUTTON);
                actions.moveToElement(logout);
                logout.click();
            } catch (ElementClickInterceptedException e) {
                return false;
            }
            return true;
        });

    }
}
