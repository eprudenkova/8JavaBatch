package com.syntax.classReview20;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelFileDemo {
    public static void main(String[] args) throws IOException {
        String path = "/Users/evgeniya/eclipse-workspace/8JavaBatch/src/com/syntax/classReview20/Test.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet("Sheet1");

        List<Person> allFileData = new ArrayList<>();

        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);
            Person person = new Person();
            person.setFirstname(row.getCell(0).toString());
            person.setLastname(row.getCell(1).toString());
            person.setAge((int) row.getCell(2).getNumericCellValue());//to int
            allFileData.add(person);
        }
        System.out.println(allFileData);

        fileInputStream.close();

        //add new line in file
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        Row row = sheet.createRow(3);
        row.createCell(0).setCellValue("Mike");
        row.createCell(1).setCellValue("Brown");
        row.createCell(2).setCellValue("35");
        workbook.write(fileOutputStream);
    }
}

