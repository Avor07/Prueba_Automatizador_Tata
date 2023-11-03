package stepdefinitions;

import Questions.GetTextQuestion;
import Task.NavigateSimulatingPage;
import Task.OpenTask;
import Task.SimulateCredit;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import userinterfaces.BankUI;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SimulateCreditStepDefinitions {
    @Managed
    WebDriver driver;

    Actor client = Actor.named("client");

    @Before
    public void setupActor() {
        client.can(BrowseTheWeb.with(driver));
    }

    @Given("The user is on simulating page")
    public void theUserIsOnSimulatingPage() {
        client.attemptsTo(
                OpenTask.openUrl(),
                NavigateSimulatingPage.navigate()

        );
    }

    @When("The user types the credit values")
    public void theUserTypesTheCreditValues() {
        client.attemptsTo(
                SimulateCredit.simulateCredit()
        );
    }

    @Then("The user should see the simulation")
    public void theUserShouldSeeTheSimulation() {
        client.should(
                seeThat(GetTextQuestion.getText(BankUI.resultCuota), Matchers.is("$718,502.33")),
                seeThat(GetTextQuestion.getText(BankUI.resultInsurance), Matchers.is("$58,051.07")),
                seeThat(GetTextQuestion.getText(BankUI.resultTotal), Matchers.is("$776,553.39"))
        );
    }
}
