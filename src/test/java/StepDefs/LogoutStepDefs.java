package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pageObjects.BasePage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LogoutStepDefs {

    private final HomePage homePage = new HomePage();
    private final LoginPage loginPage = new LoginPage();
    private final BasePage basePage = new BasePage();

    @Given("the user has a valid {string} and {string}")
    public void theUserHasAValid(String str, String str2) {
        str = "user";
        str2 = "user";

    }

    @And("the user has successfully logged in with a valid {string} and {string}")
    public void theUserIsSuccessfullyLoggedInWithAValidUsernameAndPassword(String str, String str2) {
            str = "user";
            str2 = "user";
    }


    @When("the user selects the logout button")
    public void theUserSelectsTheLogoutButton() {
        basePage.logout();
    }

    @Then("they are logged out")
    public void theyAreLoggedOut() {
        Assertions.assertTrue(homePage.isLoggedOut()); }

    @And("back to login page")
    public void backToLoginPage() {
        homePage.goTo();
    }

}
