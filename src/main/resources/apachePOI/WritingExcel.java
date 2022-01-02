package apachePOI;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("Emp-Data");
		
		Object[][] empData= {
				{"EmpID","Name","Job"},
				{101,"David","Engineer"},
				{102,"Smith","Manager"},
				{103,"Scott","Analyst"}
		};
		
		int rows=empData.length;
		int cols=empData[0].length;
		
		for(int r=0;r<rows;r++)
		{
			XSSFRow row=sheet.createRow(r);
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell=row.createCell(c);
				Object value=empData[r][c];
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
				
			}
		}
		
		String filepath=".\\src\\main\\java\\employee.xlsx";
		FileOutputStream fos=new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
		System.out.println("Employee excel written successfully!!!");
		

	}

}
