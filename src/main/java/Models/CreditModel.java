package Models;

import utils.LeerFicheros;

import java.io.IOException;

public class CreditModel {
    public String loanValue;
    public String timePeriod;
    public String creditType;

    private final String hoja="Datos";
    private final String ruta="src//main//resources//Data//Data.xlsx";
    public CreditModel() throws IOException {
        LeerFicheros leer =new LeerFicheros();
        this.loanValue= leer.leerDatoExcelCaracter(hoja,ruta,1,1);
        this.timePeriod=leer.leerDatoExcelCaracter(hoja,ruta,1,2);
        this.creditType=leer.leerDatoExcelCaracter(hoja,ruta,1,0);

    }




}
