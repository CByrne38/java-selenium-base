package StepDefs;

import data.ApplicationData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pageObjects.ApplyPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class MyStepDefs {

    private ApplicationData data;
    private HomePage homePage = new HomePage();
    private LoginPage loginPage = new LoginPage();
    private ApplyPage applyPage = new ApplyPage();




    @When("the details are submitted")
    public void theDetailsAreSubmitted() {
        homePage.goTo();
        if (homePage.getUserLoggedIn().equals("NULL")){
            homePage.goToLoginPage();
            loginPage.login("user", "user");
        }
        homePage.goToApplyPage();
        applyPage.submitApplication(data);
    }

    @Then("the application should be successful")
    public void theApplicationShouldBeSuccessful() {
        Assertions.assertTrue(applyPage.isSuccessful());
    }

    @Given("a customer is under the age of {int}")
    public void aCustomerIsUnderTheAgeOf() {
        data = new ApplicationData("Alice", "Bobson", "17", "1 New Street", "Bradford", "", "", "BD1 1AB", "tesdt@test.com", "3000");
    }

    @Then("the application should not be successful")
    public void theApplicationShouldNotBeSuccessful() {
        String error = applyPage.getError();
        Assertions.assertEquals("Error: Age must be 18 or over.", error);
    }

    @Given("a customer has a valid {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void aCustomerHasAValidFirstnameLastnameAgeAddressAddressAddressAddressPostcodeEmailLoanamount(String firstname, String lastname, String age, String address1, String address2, String address3, String address4, String postcode, String email, String amount ) {
        data = new ApplicationData(firstname, lastname, age, address1, address2, address3, address4, postcode, email, amount);
    }

}

