package testcases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		//Setup the path of the workbook
		
		XSSFWorkbook wb =new XSSFWorkbook("./data/testdata.xlsx");
		
		//Setup the worksheet
		
		XSSFSheet ws=wb.getSheet("sheet1");
		
		//Get the Row count excluding header
		
		int rowCount = ws.getLastRowNum();
		
		//Get Cell Count
		int cellCount=ws.getRow(rowCount).getLastCellNum();
		
		System.out.println(rowCount);
		System.out.println(cellCount);
		
		for (int i=1;i<=rowCount;i++) {
		for(int j=0;j<cellCount;j++) {
			
			//Read the data from cell
			String value = ws.getRow(i).getCell(j).getStringCellValue();
			System.out.println(value);
		}
			
		}
		
		
	wb.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
