package utils;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LeerFicheros {

    private XSSFWorkbook workbook;
    private FileInputStream campo;

    public LeerFicheros() {
    }

    public LeerFicheros(XSSFWorkbook workbook, FileInputStream campo) {
        this.workbook = workbook;
        this.campo = campo;
    }

    public int leerDatoExcelNumerico(String hoja, String ruta, int valorColumna, int valorFila) throws IOException {
        double value = 0;
        campo = new FileInputStream(new File(ruta));
        workbook = new XSSFWorkbook(campo);
        Sheet sheet = workbook.getSheet(hoja);
        Row row = sheet.getRow(valorFila);
        Cell cell = row.getCell(valorColumna);
        value = cell.getNumericCellValue();
        return (int)value;
    }

    public String leerDatoExcelCaracter(String hoja, String ruta, int valorColumna, int valorFila) throws IOException {
        campo = new FileInputStream(new File(ruta));
        workbook = new XSSFWorkbook(campo);
        Sheet sheet = workbook.getSheet(hoja);
        Row row = sheet.getRow(valorFila);
        Cell cell = row.getCell(valorColumna);
        return cell.getStringCellValue();

    }

}
