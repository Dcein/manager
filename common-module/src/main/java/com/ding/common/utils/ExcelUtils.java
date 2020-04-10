package com.ding.common.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @Description: excel file process tools
 * @Author: cc.ding
 * @Date: created in 2020/4/10 14:20
 */
public class ExcelUtils {

    public String readExcelFileToString(File excelFile){
        InputStream ins = null;
        Workbook wb = null;
        try {
            ins = new FileInputStream(excelFile);
            wb = WorkbookFactory.create(ins);
            Sheet sheet = wb.getSheetAt(0);
            int rows = sheet.getLastRowNum();
            for (int i = 0; i < rows; i++){
                Row row = sheet.getRow(i);
                //依次遍历第i行的单元格内容
                String cell_1 = StringUtils.EMPTY;
                String cell_2 = StringUtils.EMPTY;
                if (row.getCell(0) != null){
                    cell_1 = row.getCell(0).getStringCellValue() ;
                }
                if (row.getCell(1) != null){
                    cell_2 = row.getCell(1).getStringCellValue() ;
                }
            }
        }catch (Exception e){

        }
        return null;
    }
}
