package pageObjects;

import data.NewUserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewUserPage extends BasePage {
    public void addNewUser(NewUserData newUserData){
        driver.findElement(By.id("formBasicUsername")).sendKeys(newUserData.getUsername());
        driver.findElement(By.id("formBasicEmail")).sendKeys(newUserData.getEmail());
        driver.findElement(By.id("formBasicPassword")).sendKeys(newUserData.getPassword());

        WebElement button = driver.findElement(By.xpath("//button[text()='Register']"));
        actions.moveToElement(button).perform();
        button.click();
    }


}


