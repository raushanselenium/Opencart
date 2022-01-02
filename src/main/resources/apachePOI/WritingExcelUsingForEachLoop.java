package apachePOI;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcelUsingForEachLoop {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("Employee-Data");
		Object[][] empData= {
				{"EmpID","Name","Job"},
				{101,"David","Engineer"},
				{102,"Smith","Manager"},
				{103,"Scott","Analyst"}
		};
		int r=0;
		for(Object emp[]:empData)
		{
			XSSFRow row=sheet.createRow(r++);
			int c=0;
			for(Object value:emp)
			{
				XSSFCell cell=row.createCell(c++);
				if(value instanceof String)
				cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}
		String filepath=".\\src\\main\\java\\employeeData.xlsx";
		FileOutputStream fos=new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
		System.out.println("Employee Data  written successfully");

	}

}
