package utils;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name="LoginData")
	public Object[][] getData() throws Exception {

	    return new Object[][] {

	        {ExcelUtils.getCellData(1,0), ExcelUtils.getCellData(1,1)},
	        {ExcelUtils.getCellData(2,0), ExcelUtils.getCellData(2,1)},
	        {ExcelUtils.getCellData(3,0), ExcelUtils.getCellData(3,1)}

	    };
	}
}