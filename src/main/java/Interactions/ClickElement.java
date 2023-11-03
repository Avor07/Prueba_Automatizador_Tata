package Interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;



public class ClickElement implements Interaction {

    Target element;
    public ClickElement(Target element) {
        this.element=element;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(this.element)
        );
    }

    public static ClickElement click(Target target){
        return Instrumented.instanceOf(ClickElement.class).withProperties(target);
    }
}
