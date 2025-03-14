package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {



    @Given("the user has a valid <username> and <password>")
    public void theUserHasAValidUsernameAndPassword() {

    }

    @And("noone else is logged in already")
    public void nobodyHisLoggedInAlready() {
    }

    @When("the user logs in with {string} and {string}")
    public void theUserLogsInWithUsernameAndPassword(String str, String str2) {
        str = "user";
        str2 = "user";
    }

    @Then("they are logged in")
    public void theyAreLoggedIn() {
    }



}
