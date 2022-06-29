package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step12 {


    @Given("i launch the parabank application using  {string}")
    public void i_launch_the_parabank_application_using(String url) {
        // Write code here that turns the phrase above into concrete actions
//       parabanklogin.launchURL();
        //parabanklogin.launchURLwithDrivermanager();
        com.gluecode.Loginpage.LaunchURL(url);



    }

    @When("i enter  USER NAME as {string}")
    public void i_enter_user_name_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("test2");
        com.gluecode.Loginpage.verifyLogin();
    }
    @When("i enter PASSWORD as {string}")
    public void i_enter_password_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("test3");
    }
    @When("i click on submit button")
    public void i_click_on_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("test4");
    }
    @Then("i Verify  invalid  message is displayed as  {string}")
    public void i_verify_invalid_message_is_displayed_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("test5");
    }

}
