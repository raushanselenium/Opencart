package apachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadPasswordProtectedExcelUsingIterator {

	public static void main(String[] args) throws IOException {
		
		String path=".\\src\\main\\java\\emp.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=(XSSFWorkbook) WorkbookFactory.create(fis,"12345");
		XSSFSheet sheet=wb.getSheetAt(0);
		Iterator<Row> itr=sheet.iterator();
		while(itr.hasNext())
		{
			XSSFRow row=(XSSFRow) itr.next();
			Iterator<Cell> cellIterator=row.cellIterator();
			while(cellIterator.hasNext())
			{
				XSSFCell cell=(XSSFCell) cellIterator.next();
				switch(cell.getCellType())
				{
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
		wb.close();
		fis.close();
	}

}
