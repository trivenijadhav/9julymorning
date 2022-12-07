package excelsheet_reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet_Eg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile= new File("C:\\myselenium\\Excelsheet1.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
				String value = mysheet.getRow(0).getCell(0).getStringCellValue();
				System.out.println(value);
				
				boolean value1 = mysheet.getRow(1).getCell(1).getBooleanCellValue();
				System.out.println(value1);
				
				double value2 = mysheet.getRow(2).getCell(3).getNumericCellValue();
				System.out.println(value2);
				
				
				
		
		
	}

}
