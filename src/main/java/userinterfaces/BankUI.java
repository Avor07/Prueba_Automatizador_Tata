package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BankUI {
    public static Target btnSaberMas =
            Target.the("Button Saber mas").locatedBy("//a[@href=\"/personas/creditos/consumo\"]");
    public static Target btnVehiculos =
            Target.the("Button Vehiculos").located(By.id("tab-categoria-vehiculo"));

    public static Target btnSimularAltoCilindraje =
            Target.the("Button simular credito alto cilindraje")
                    .locatedBy("//*[contains(text(),\"alto cilindraje\")]//..//..//../div[3]/div/a[contains(text(),\"Simular\")]");
    public static Target selectTipoCredito=
            Target.the("Select tipo credito").located(By.name("tipoCredito"));
    public static Target inputValor=
            Target.the("input valor solicitado").located(By.name("valorSolicitado"));
    public static Target selectPlazo=
            Target.the("input plazo").located(By.name("plazo"));

    public static Target btnSimular=
            Target.the("button simular credito").located(By.id("btnSubmit"));

    public static Target resultCuota=
            Target.the("Credit result quote").locatedBy("//p[contains(text(),\"Cuota\")]/../../div[2]/p/strong");
    public static Target resultQuota=
            Target.the("Credit result quote").locatedBy("//p[contains(text(),\"Cuota\")]/../../div[2]/p/strong");
    public static Target resultInsurance=
            Target.the("Credit result insurance").locatedBy("//p[contains(text(),\"Seguro\")]/../../div[2]/p/strong");

    public static Target resultTotal=
            Target.the("credit result").locatedBy("//strong[contains(text(),\"Total\")]/../../../div[2]/p/strong");

}

