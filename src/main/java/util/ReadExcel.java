package util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static String[][] inputData(String FileName) throws IOException {
		
		//open my excel
		//Set the path for workbook (file path)
		XSSFWorkbook wb =new XSSFWorkbook("Data/"+FileName+".xlsx");
		//go into sheet based on sheet name
		//XSSFSheet sheet = wb.getSheet("Sheet1");  //input string name
		//Get into the sheet based on index
		XSSFSheet ws = wb.getSheetAt(0);
		//To get the row count
		int rowCount = ws.getLastRowNum();
		short columnCount = ws.getRow(0).getLastCellNum();
		//To pass the data
        String [][] data =new String[rowCount][columnCount];
	
		//Get Row
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = ws.getRow(i);
		//To get the columnCount
			short columnCount1 = row.getLastCellNum();
			
		//Get my Column
		for(int j=0;j<columnCount1;j++) {
	   XSSFCell cell = row.getCell(j);
	   
	 //Read the data from cell
       data[i-1][j]=cell.getStringCellValue();//1 0
	   //print the particular value
	   String cellvalue = cell.getStringCellValue();
	   System.out.println(cellvalue);
	   //close the workbook
	   wb.close();
		
		}
	}
		return data;

	
		
	
	
}
}




