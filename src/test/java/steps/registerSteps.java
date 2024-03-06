package steps;

import com.ToolsWebsiteEcommerce.Base;
import com.ToolsWebsiteEcommerce.Pages.registerPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registerSteps extends Base {
    @Given("User open the browser")
    public void user_open_the_browser() {
        luncher();

    }
    @When("User fill the credential and click on register")
    public void user_fill_the_credential_and_click_on_register() throws InterruptedException {
        registerPage.getInstance().performRegistration();

    }
    @Then("Account should be created")
    public void account_should_be_created() {

    }


}
