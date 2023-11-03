package Task;

import Interactions.ClickElement;
import Interactions.SelectElement;
import Interactions.TypeText;
import Models.CreditModel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import userinterfaces.BankUI;

import java.io.IOException;

public class SimulateCredit implements Task {

    CreditModel credit;

    public SimulateCredit() throws IOException {
        credit = new CreditModel();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectElement.selectElement(credit.creditType, BankUI.selectTipoCredito),
                TypeText.typeText(credit.loanValue,BankUI.inputValor),
                SelectElement.selectElement(credit.timePeriod,BankUI.selectPlazo),
                ClickElement.click(BankUI.btnSimular)
        );
    }

    public static SimulateCredit simulateCredit() {
        return Instrumented.instanceOf(SimulateCredit.class).withProperties();
    }
}
