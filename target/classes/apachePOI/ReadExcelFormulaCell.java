package apachePOI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFormulaCell {

	public static void main(String[] args) throws IOException {
		
		String filepath=".\\src\\main\\java\\salary.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("sheet1");
		
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(0).getLastCellNum();
		System.out.println(rows+"---"+cols);
		
		for(int r=0;r<=rows;r++)
		{
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell=row.getCell(c);
				
				switch(cell.getCellType())
				{
				case STRING:
					System.out.print(cell.getStringCellValue()+"\t");
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue()+"\t");
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue()+"\t");
					break;
				case FORMULA:
					System.out.println(cell.getNumericCellValue());
					break;
				}
			}
			System.out.println("");
		}

	}

}
