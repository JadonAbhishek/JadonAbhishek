package webdriverBasics;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel {

	public static void main(String[] args) throws BiffException, IOException {
		
		
		Workbook wb = Workbook.getWorkbook(new File ("C:\\Users\\dell\\Desktop\\My Inv..xlsx"));
		
		Sheet sh = wb.getSheet("Sheet1");
		
		for (int i=0; i<sh.getRows(); i++)
		{
			///System.out.println("NAME: "+ sh.getCell(0, i).getContents());
			
			sh.getCell(0, i).getContents();
			
			///System.out.println("Total inv : "+ sh.getCell(1, i).getContents());
			
		}

	}

}
