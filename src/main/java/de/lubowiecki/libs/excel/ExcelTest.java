package de.lubowiecki.libs.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class ExcelTest {

    private static final String EXCEL_FILE = "data.xlsx";

    public static void main(String[] args) {

        // Schreiben
        List<Person> data = new ArrayList<>();
        data.add(new Person(1, "Peter", "Parker"));
        data.add(new Person(2, "Carol", "Danvers"));
        data.add(new Person(3, "Bruce", "Banner"));
        data.add(new Person(4, "Natasha", "Romanov"));
        // saveToExcelFile(data);

        // Lesen

        // Mit der Datei verbinden
        try(FileInputStream in = new FileInputStream(EXCEL_FILE)) {

            XSSFWorkbook workbook = new XSSFWorkbook(in);
            XSSFSheet sheet = workbook.getSheet("Personal");

            // Daten einlesen
            Iterator<Row> rows = sheet.iterator();
            List<Person> personen = new ArrayList<>();

            // Daten zeilenweise verarbeiten
            // Zeile mit Überschriften aus Excel überspringen
            rows.next();

            while(rows.hasNext()) {
                // aktuelle Zeile Abfragen
                Row current = rows.next();
                Iterator<Cell> cells = current.iterator();
                // In Person Objekte umwandeln
                Person p = new Person();
                p.setNr((int) cells.next().getNumericCellValue());
                p.setVorname(cells.next().getStringCellValue());
                p.setNachname(cells.next().getStringCellValue());
                personen.add(p);
            }

            System.out.println(personen);

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveToExcelFile(List<Person> data) {
        // Excel-Dokument erzeugen
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Excel-Datenblatt erzeugen
        XSSFSheet sheet = workbook.createSheet("Personal");

        {
            Row row = sheet.createRow(0);
            row.createCell(0).setCellValue("Nr");
            row.createCell(1).setCellValue("Vorname");
            row.createCell(2).setCellValue("Nachname");
        }

        // Daten dem Blatt hinzufügen
        for(int i = 0; i < data.size() ; i++) {
            Person curret = data.get(i);
            Row row = sheet.createRow(i + 1);
            row.createCell(0).setCellValue(curret.getNr());
            row.createCell(1).setCellValue(curret.getVorname());
            row.createCell(2).setCellValue(curret.getNachname());
        }

        // Mit Datei Verbinden
        try(FileOutputStream out = new FileOutputStream(EXCEL_FILE)) {
            // In die Datei schreiben
            workbook.write(out);
        }
        catch (IOException e) {
           e.printStackTrace();
        }
    }
}
