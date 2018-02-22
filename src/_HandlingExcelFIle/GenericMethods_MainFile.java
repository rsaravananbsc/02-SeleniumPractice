package _HandlingExcelFIle;

public class GenericMethods_MainFile {

	public static void main(String[] args) {
			
			String path = ".\\TestData2.xlsx";
			int rowCount = GenericMethods_ClassFile.getRowCount(path, "sheet1");
			System.out.println(rowCount);
			
			String cellValue = GenericMethods_ClassFile.getCellValue(path, "sheet1", 0, 0);
			System.out.println(cellValue);
			
	}	

}
