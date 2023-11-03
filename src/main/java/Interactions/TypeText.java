package Interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;


public class TypeText implements Interaction {

    String value;
    Target element;

    public TypeText(String value, Target element) {
        this.value = value;
        this.element = element;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(value).into(element)
        );
    }

    public static TypeText typeText(String value, Target element) {
        return Instrumented.instanceOf(TypeText.class).withProperties(value, element);
    }
}
