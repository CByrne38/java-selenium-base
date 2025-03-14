package pageObjects;

import data.ApplicationData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ApplyPage extends BasePage{
    public void submitApplication(ApplicationData applicationData) {
        driver.findElement(By.id("formFirstName")).sendKeys(applicationData.getFirstname());
        driver.findElement(By.id("formLastName")).sendKeys(applicationData.getLastname());
        driver.findElement(By.id("formAge")).sendKeys(applicationData.getAge());
        driver.findElement(By.id("formAddressLine1")).sendKeys(applicationData.getAddress1());
        driver.findElement(By.id("formAddressLine2")).sendKeys(applicationData.getAddress2());
        driver.findElement(By.id("formAddressLine3")).sendKeys(applicationData.getAddress3());
        driver.findElement(By.id("formAddressLine4")).sendKeys(applicationData.getAddress4());
        driver.findElement(By.id("formPostcode")).sendKeys(applicationData.getPostcode());
        driver.findElement(By.id("formEmail")).sendKeys(applicationData.getEmail());
        driver.findElement(By.id("formLoanAmount")).sendKeys(applicationData.getAmount());
        WebElement button = driver.findElement(By.cssSelector("form button"));
        actions.moveToElement(button).perform();
        button.click();
    }

    public boolean isSuccessful(){
        return driver.findElement(By.tagName("p")).getText().contains("successful");
    }

    public String getError() {
        return driver.findElement(By.className("alert")).getText();
    }
}
