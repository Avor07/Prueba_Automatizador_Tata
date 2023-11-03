package Task;

import Interactions.ClickElement;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import userinterfaces.BankUI;

public class NavigateSimulatingPage implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickElement.click(BankUI.btnSaberMas),
                ClickElement.click(BankUI.btnVehiculos),
                ClickElement.click(BankUI.btnSimularAltoCilindraje)
        );
    }

    public static NavigateSimulatingPage navigate(){
        return Instrumented.instanceOf(NavigateSimulatingPage.class).withProperties();
    }
}
