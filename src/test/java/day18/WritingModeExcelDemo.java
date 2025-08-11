package day18;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// Excel File-> Workbook -> Sheets -> Rows -> Cell
public class WritingModeExcelDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("pathOfTheFile");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Data");

        XSSFRow row1 = sheet.createRow(0);
            row1.createCell(1).setCellValue("Automation 1");
            row1.createCell(0).setCellValue("welcome");
            row1.createCell(2).setCellValue("Java");

        XSSFRow row2 = sheet.createRow(1);
            row2.createCell(1).setCellValue("Automation 2");
            row2.createCell(0).setCellValue("welcome");
            row2.createCell(2).setCellValue("Python");

        XSSFRow row3 = sheet.createRow(2);
            row3.createCell(1).setCellValue("Automation 3");
            row3.createCell(0).setCellValue("welcome");
            row3.createCell(2).setCellValue("Selenium");

        workbook.write(file);
        workbook.close();
        file.close();

    }
}
