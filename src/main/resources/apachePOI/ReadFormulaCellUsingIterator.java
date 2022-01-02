package apachePOI;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFormulaCellUsingIterator {

	public static void main(String[] args) throws IOException {
		
		String filepath=".\\src\\main\\java\\salary.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		
		Iterator<Row> itr=sheet.iterator();
		while(itr.hasNext())
		{
			XSSFRow row=(XSSFRow)itr.next();
			Iterator<Cell> cellitr=row.cellIterator();
			while(cellitr.hasNext())
			{
				Cell cell=cellitr.next();
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
			System.out.println();
		}
		

	}

}
