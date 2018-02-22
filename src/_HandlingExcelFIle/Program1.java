package _HandlingExcelFIle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Program1 {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		String path = "./TestData/TestData.xlsx";
//		//Open Excel File
		Workbook wb = WorkbookFactory.create(new File(path)); //Workbook wb = WorkbookFactory.create(new FileInputStream(path));
//		//Go to Excel File
//		Sheet sh = wb.getSheet("Sheet1");
//		//Go to Excel Row
//		Row rw = sh.getRow(0);
//		//Go to Excel Cell
//		Cell cl = rw.getCell(0);
//		//Get Data From Excel Cell
//		String vl = cl.getStringCellValue(); //String v = cl.toString(); //To get all DataTypes from Files.
//		//Printing Value
//		System.out.println(vl);	
		
		
		//--------------------------------------------------------------------------------------------
		//Optimized Code	 
//		String vl1 = wb.getSheet("Sheet1").getRow(0).getCell(2).toString(); 
//		System.out.println(vl1);
		
		//--------------------------------------------------------------------------------------------
		
//		int rc = wb.getSheet("Sheet1").getLastRowNum();
//		int cc = wb.getSheet("Sheet1").getRow(0).getLastCellNum();
//		
//		for (int i = 0; i <= rc; i++) {
//			for (int j = 0; j <= cc; j++) {
//				String vl2 = wb.getSheet("Sheet1").getRow(i).getCell(j).toString(); 
//				System.out.println(vl2);
//			}
//		}
		
		//--------------------------------------------------------------------------------------------
		
		//Existing Row Existing Cell
		wb.getSheet("Sheet2").getRow(0).getCell(0).setCellValue("BTM");
		
		//Existing Row New Cell
		wb.getSheet("Sheet2").getRow(0).createCell(1).setCellValue("BTM");
		
		//New Row New Cell
		wb.getSheet("Sheet2").createRow(1).createCell(0).setCellValue("BTM");
	
		//Saving File
		wb.write(new FileOutputStream("path"));
		
		//Saving File with Different File name
		wb.write(new FileOutputStream("./TestData/TestData1.xlsx"));
		
		
		

	}

}
