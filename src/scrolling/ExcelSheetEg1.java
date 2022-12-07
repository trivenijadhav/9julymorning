package scrolling;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetEg1 {

	public static void ExcelScroll1(int rowvalue, int cellvalue) throws EncryptedDocumentException, IOException
	
	{
		File myfile= new File("C:\\myselenium\\excelsheet1.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		String value = mysheet.getRow(rowvalue).getCell(cellvalue).getStringCellValue();
		
		System.out.println(value);

	}

}
