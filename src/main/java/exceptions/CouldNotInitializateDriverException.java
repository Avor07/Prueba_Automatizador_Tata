package exceptions;

import net.thucydides.core.webdriver.DriverConfigurationError;

public class CouldNotInitializateDriverException extends DriverConfigurationError {

    private static final String MESSAGE_FORMAT_COULD_NOT_INITIALIZATE_DRIVER = "El driver no existe o no pudo ser encontrado";
    public CouldNotInitializateDriverException() {
        super(MESSAGE_FORMAT_COULD_NOT_INITIALIZATE_DRIVER);
    }

}
