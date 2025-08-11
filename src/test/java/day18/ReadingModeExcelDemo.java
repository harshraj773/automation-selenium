package day18;
// Excel File -> WorkBook -> Sheets -> Rows -> Cells

// Java provides Class for handling files
//1. FileInputStream -> Reading mode
//2. FileOutputStream -> Writing mode

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

// Apache Class provide some class for handling
//1. XSSFWorkbook -> workbook
//2. XSSFSheet -> sheets
//3. XSSFRow -> Row
//4. XSSFCell -> Cell
public class ReadingModeExcelDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new  FileInputStream("pathOfFile");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("nameOfSheet");
        int totalRows = sheet.getLastRowNum();
        int totalCols = sheet.getRow(1).getLastCellNum();
        System.out.println("Total no. of Rows: "+totalRows); // rows start from 0
        System.out.println("Total no. of Columns: "+totalCols); // cols start from 1

        for(int r = 0; r <=totalRows; r++){
            XSSFRow currentRow = sheet.getRow(r); // getting complete row
            for(int c=0; c<totalCols; c++){
                XSSFCell cell = currentRow.getCell(c);
                System.out.println(cell.toString()); // printing data from cell
            }
        }
        workbook.close();
        file.close();
    }
}
