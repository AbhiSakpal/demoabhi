package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelwritee {

	public static void main(String[] args) throws IOException {
		
		File path = new File("C:\\Users\\abhis\\OneDrive\\Documents\\demo.xlsx");
		
		FileInputStream load = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		
		FileOutputStream writeoutput = new FileOutputStream(path);
		sheet1.createRow(1).createCell(0).setCellValue("abhi");
		workbook.write(writeoutput);
	}
}
