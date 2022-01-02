package apachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToHashMap {

	public static void main(String[] args) throws IOException {
		
		String path=".\\src\\main\\java\\resource.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(0).getLastCellNum();
		HashMap<String,String> data=new HashMap<String,String>();
		for(int r=0;r<=rows;r++)
		{
			XSSFRow row=sheet.getRow(r);
			String key=row.getCell(0).getStringCellValue();
			String value=row.getCell(1).getStringCellValue();
			data.put(key,value);
		}
		
		for(Map.Entry<String,String> entry:data.entrySet())
		{
			System.out.println(entry.getKey()+"--"+entry.getValue());
			
		}
		
		

	}

}
