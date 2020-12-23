package com.syntax.class35;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelFileHandlingDemo4 {
    public static void main(String[] args) throws IOException {

        String path = "/Users/evgeniya/eclipse-workspace/8JavaBatch/src/com/syntax/class35/Test.xlsx";
        System.out.println(path);//path to the file
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);//helps us read the data
        Sheet sheet = workbook.getSheet("Sheet 1");
        for (int row = 0; row <sheet.getPhysicalNumberOfRows(); row++) {
            Row rowData = sheet.getRow(row);
            rowData.getPhysicalNumberOfCells();
            for(int cell =0; cell<rowData.getPhysicalNumberOfCells();cell++){
                System.out.print(rowData.getCell(cell)+" ");
            }
            System.out.println();
//            String firstName = row.getCell(0).getStringCellValue();
//            String lastName = row.getCell(1).getStringCellValue();
//            String hobby = row.getCell(2).getStringCellValue();
//            int age = (int) row.getCell(3).getNumericCellValue();
//            int age1 = Integer.parseInt(row.getCell(3).getStringCellValue());
        }
    }
}
