package StepDefs;

import data.ApplicationData;
import io.cucumber.java.en.Given;

public class MoreStepDefs {

    private ApplicationData data;

    @Given("a customer has valid name and address details")
    public void aCustomerHasValidNameAndAddressDetails() {
        data = new ApplicationData("Alice", "Bobson", "21", "1 New Street", "Bradford", "", "", "BD1 1AB", "tesdt@test.com", "3000");
    }
}
