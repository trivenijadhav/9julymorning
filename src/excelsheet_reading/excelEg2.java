package excelsheet_reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile= new File("C:\\myselenium\\excelsheet1.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
		
		for(int i=0; i<=3; i++)
		{
			String row = mysheet.getRow(3).getCell(i).getStringCellValue();
			
			System.out.print(row +" ");
		}
		
		for (int j=0; j<=3; j++)
		{
			String cell = mysheet.getRow(j).getCell(4).getStringCellValue();
			
			System.out.println(cell);
		}
		
		

	}

}
