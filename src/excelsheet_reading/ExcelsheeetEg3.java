package excelsheet_reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelsheeetEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile =new File("C:\\myselenium\\excelsheet1.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myFile).getSheet("sheet1");
		
		//to read all sheet
		
		for (int i=0; i<=3; i++)
		{
			
			for(int j=0; j<=4; j++) 
			{
				Cell mycell = mysheet.getRow(i).getCell(j);
				CellType datatype = mycell.getCellType();
		
		 if(datatype==CellType.STRING)
		 {
			 System.out.print(mycell.getStringCellValue()+ " ");
			 
		 }
		 else if(datatype==CellType.NUMERIC)
		 {
			 System.out.print(mycell.getNumericCellValue() +" ");
		 }
		 else if(datatype==CellType.BOOLEAN)
		 {
			 System.out.print(mycell.getBooleanCellValue() +" ");
		 }

		}
			System.out.println();
		}
		
		

	}

}
