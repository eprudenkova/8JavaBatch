package com.syntax.class36;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelFile {
    public static void main(String[] args) throws IOException {
        String path = "/Users/evgeniya/Desktop/TestData.xlsx";
        System.out.println(path);
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);//used to manipulate the file with extension xlsx
//        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();//To manipulate the files with extension xls

        Sheet sheet = xssfWorkbook.getSheet("PersonData");

        List<PersonInfo> personInfoList = new ArrayList<>();

        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {//starting with 1 - do not read the header

            Row row = sheet.getRow(i);

            PersonInfo personInfo = new PersonInfo();

            personInfo.setFirstName(row.getCell(0).getStringCellValue());

            personInfo.setLastName(row.getCell(1).toString());

            personInfo.setAge((int) row.getCell(2).getNumericCellValue());//cast to int, bcs it expects a String

            personInfo.setSalary(row.getCell(3).getNumericCellValue());

            personInfoList.add(personInfo);

        }
        for (PersonInfo element: personInfoList) {

            System.out.println(element.getFirstName());
        }
        System.out.println(personInfoList);

    }
}
