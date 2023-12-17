package stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import tasks.LogIn;
import userinterface.HomePage;

public class LoginStepDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Usuario QA");
    }
    @Given("the user is on the main page")
    public void theUserIsOnTheMainPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Open.url("https://accounts.google.com/signin")
        );
    }

    @When("he fills in the {string} and {string}")
    public void heFillsInTheAnd(String username, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LogIn.successfully(username, password)
        );
    }
    @Then("he can see the inbox of {string}")
    public void heCanSeeTheInboxOf(String user) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(HomePage.USER_NAME.of(user)).isEnabled()
        );
    }

    @Then("he can see the {string} error")
    public void heCanSeeTheError(String message) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(HomePage.ERROR_PASS_MESSAGE.of(message)).isEnabled()
        );
    }
}
