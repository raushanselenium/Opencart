package apachePOI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
	
		String excelFilePath=".\\src\\main\\java\\countries.xlsx";
		FileInputStream fis=new FileInputStream(excelFilePath);//Opened file in stream(reading) mode
		XSSFWorkbook wb=new XSSFWorkbook(fis);//got the workbook
		//XSSFSheet sheet=wb.getSheet("country-capital");//got the sheet using sheet name
		XSSFSheet sheet=wb.getSheetAt(0);//got the sheet using index
		
		//Read excel data using for loop
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(1).getLastCellNum();
		System.out.println(rows+"---"+cols);
		
		for(int r=0;r<=rows;r++)
		{
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<cols;c++)
			{
				XSSFCell  cell=row.getCell(c);  
				
				switch(cell.getCellType())
				{
				case STRING: 
					System.out.print(cell.getStringCellValue()+"\t");
					break;
				case NUMERIC:		
					System.out.print(cell.getNumericCellValue()+"\t");
					break;
				case  BOOLEAN:
					System.out.print(cell.getBooleanCellValue()+"\t");
					break;
				}
			}
			System.out.println();
		}
		
		
				
		

	}

}
