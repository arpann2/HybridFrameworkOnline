package dataProvider;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by arpan on 05/12/2016.
 */
public class ExcelDataProvider {

    XSSFWorkbook wb;

    //  XSSFSheet sheet;
    public ExcelDataProvider() {
        String source = ".\\ApplicationTestData\\MOCK_DATA.xlsx";

        try {
            File file = new File(source);
            FileInputStream fis = new FileInputStream(file);
            wb = new XSSFWorkbook(fis);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception is: " + e.getMessage());
        }
    }


    public String getData(int sheetIndex, int row, int column) {

        String data = wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();

        return data;
    }

    public String getData(String sheetName, int row, int column) {

        String data = wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();

        return data;
    }


}
