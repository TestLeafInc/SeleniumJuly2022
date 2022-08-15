package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelData {
	
	@Test
	public void readData() throws IOException {
		
		
		/*
		 * Steps to read from excel
		 * 
		 *  1) Open the workbook using file name and path
			2) Go to the specific sheet (by sheet name or index)
			3) Go to the specific row (by index)
			4) Go to the specific column (by index) -- cell
			5) Read the content
		 */

		XSSFWorkbook wbook = new XSSFWorkbook("data/CreateLead.xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0); // read the first sheet
		int rowCount = sheet.getLastRowNum();
		short columnCount = sheet.getRow(0).getLastCellNum();

		System.out.println("Row count "+rowCount);
		System.out.println("Column count "+columnCount);
		
		
		for(int i=1;i <= rowCount;i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) { // looping through each cell of the first row.
				XSSFCell cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
			}
		}
		
		wbook.close();
		
	}

}
