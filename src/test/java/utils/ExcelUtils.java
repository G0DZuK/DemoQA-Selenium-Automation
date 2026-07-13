package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import java.io.FileOutputStream;

public class ExcelUtils {
	static String filePath="C:\\Users\\jerry\\eclipse-workspace\\DemoQA\\src\\main\\resources\\TestLogin.xlsx";
	
	public static String getCellData(int row, int col) throws IOException {
		FileInputStream fis=new FileInputStream(filePath);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("LoginPage");
		if(sheet==null) {
			throw new RuntimeException("Sheet not found");
		}
		if(sheet.getRow(row)==null) {
			throw new RuntimeException("Row not found");
		}
		String data=sheet.getRow(row).getCell(col).getStringCellValue();
		wb.close();
		
		
		
		
		return data;
		
		
	}
	//data writing code to excel
		public static void setCellData(int row,int col, String value)throws Exception{
			FileInputStream fis = new FileInputStream(filePath);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheet("LoginPage");
			sheet.getRow(row).createCell(col).setCellValue(value);
			FileOutputStream fos=new FileOutputStream(filePath);
			wb.write(fos);
			wb.close();
			fos.close();
		}

}
