package Interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.ui.Select;
import net.serenitybdd.screenplay.targets.Target;
public class SelectElement implements Interaction {

    String value;
    Target element;

    public SelectElement(String value, Target element) {
    this.value=value;
    this.element=element;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Select.value(value).from(element)
        );
    }

    public static SelectElement selectElement(String value,Target element){
        return Instrumented.instanceOf(SelectElement.class).withProperties(value,element);
    }
}
