package com.pwt.upload.download;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.LoggerFactory;

import com.pwt.upload.controller.OutputController;
import com.pwt.upload.model.AccountData;

public class DownloadExcel {
	
	final static org.slf4j.Logger logger = LoggerFactory.getLogger(OutputController.class);
	
	public static void writeToExcel(List<AccountData> list, String fileName)throws SQLException, IOException {
        
        logger.error("Inside write to excel list => " + list.size() + " fileName => " + fileName);
        
        XSSFWorkbook workbook = new XSSFWorkbook();
        
        XSSFSheet spreadsheet = workbook.createSheet(" Account Data ");       

        XSSFRow row;
        int rowid = 0;
        
//        XSSFRow header = spreadsheet.createRow(rowid);
        row = spreadsheet.createRow(rowid);
        row.createCell(0).setCellValue("Status");
        row.createCell(1).setCellValue("User");
        row.createCell(2).setCellValue("Mandatory Account");
        row.createCell(3).setCellValue("Account Number");
        row.createCell(4).setCellValue("Name");
        row.createCell(5).setCellValue("Sanction Date");
        row.createCell(6).setCellValue("Audit Date");
        row.createCell(7).setCellValue("Outstanding Amount");
        row.createCell(8).setCellValue("Overdue");
        row.createCell(9).setCellValue("Overdue Since");
        row.createCell(10).setCellValue("ROI");	
        row.createCell(11).setCellValue("Asset Class");
        row.createCell(12).setCellValue("Description Of Activity");
        row.createCell(13).setCellValue("Zone");
        row.createCell(14).setCellValue("Region");
        row.createCell(15).setCellValue("Branch Name");
        row.createCell(16).setCellValue("Scheme Description");
        row.createCell(17).setCellValue("Limit");
        row.createCell(18).setCellValue("Customer ID");
        row.createCell(19).setCellValue("Scheme Code");
        row.createCell(20).setCellValue("Sol ID");	

        
        for(int i =0; i < list.size();i++)
        {
        	int cellId = 0;
                       
            row = spreadsheet.createRow(++rowid);
            XSSFCell cell =row.createCell(cellId++);
            cell.setCellValue(list.get(i).getStatus());
            cell =row.createCell(cellId++);
            cell.setCellValue(list.get(i).getUserId());
            cell =row.createCell(cellId++);
            cell.setCellValue(list.get(i).getMandatory());
            cell =row.createCell(cellId++);
            cell.setCellValue(list.get(i).getId());
            cell =row.createCell(cellId++);
            cell.setCellValue(list.get(i).getCustomerName());
            cell =row.createCell(cellId++);
            cell.setCellValue(list.get(i).getSanctionDate());
            cell =row.createCell(cellId++);
            cell.setCellValue(list.get(i).getAuditDate());
            cell =row.createCell(cellId++);
            cell.setCellValue(list.get(i).getOutstandingAmt());
            cell =row.createCell(cellId++);
            cell.setCellValue(list.get(i).getOverdue());
            cell =row.createCell(cellId++);
            cell.setCellValue(list.get(i).getOverduesSince());
            cell =row.createCell(cellId++);
            cell.setCellValue(list.get(i).getRoi());
            cell =row.createCell(cellId++);
            cell.setCellValue(list.get(i).getAssetClass());
            cell =row.createCell(cellId++);
            cell.setCellValue(list.get(i).getDescOfActivity());
            cell =row.createCell(cellId++);
            cell.setCellValue(list.get(i).getZone());
            cell =row.createCell(cellId++);
            cell.setCellValue(list.get(i).getRegion());
            cell =row.createCell(cellId++);
            cell.setCellValue(list.get(i).getBranchName());
            cell =row.createCell(cellId++);
            cell.setCellValue(list.get(i).getSchemeDesc());
            cell =row.createCell(cellId++);
            cell.setCellValue(list.get(i).getLimit());
            cell =row.createCell(cellId++);
            cell.setCellValue(list.get(i).getCustomerId());
            cell =row.createCell(cellId++);
            cell.setCellValue(list.get(i).getSchemeCode());
            cell =row.createCell(cellId++);
            cell.setCellValue(list.get(i).getSolId());
        }

        FileOutputStream out = new FileOutputStream(new File("D:\\A3\\A3_SPRING_BOB\\a3spring260323\\sample\\sample\\Files-Upload\\"+ fileName));

        //XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        workbook.write(out);
        out.close();
        workbook.close();   
        }
}
