package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadData {
	
	public static String[][] readData(String excelName) throws IOException {
		
		
		XSSFWorkbook wbook = new XSSFWorkbook("data/"+excelName+".xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0); // read the first sheet
		int rowCount = sheet.getLastRowNum();
		short columnCount = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[rowCount][columnCount];
		
		
		for(int i=1;i <= rowCount;i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) { // looping through each cell of the first row.
				XSSFCell cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
				data[i-1][j] = cell.getStringCellValue();
			}
		}
		
		wbook.close();
		return data;
		
	}

}
