package com.syntax.class35;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFileHandlingDemo2 {
    public static void main(String[] args) throws IOException {

        String path = "/Users/evgeniya/eclipse-workspace/8JavaBatch/src/com/syntax/class35/Test.xlsx";
        System.out.println(path);//path to the file
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);//helps us read the data
        Sheet sheet = workbook.getSheet("Sheet 2");
        Row row = sheet.getRow(1);
        Cell cell = row.getCell(2);
        System.out.println(cell);//Kerim
    }
}
