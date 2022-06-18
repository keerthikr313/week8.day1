package week8.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnThrows {
	public static void main(String[] args) throws IOException {
		//if we use try/catch it will not fail the script 
		//if we use add throws declaration we are saying it is okey to fail the entire script
		XSSFWorkbook book = new XSSFWorkbook("./testData/"+"tc001.xlsx");
	}
}

