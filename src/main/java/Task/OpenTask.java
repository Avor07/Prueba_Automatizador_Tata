package Task;


import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.url("https://www.bancolombia.com/personas")
        );
    }

    public static OpenTask openUrl() {
        return Instrumented.instanceOf(OpenTask.class).withProperties();
    }
}
