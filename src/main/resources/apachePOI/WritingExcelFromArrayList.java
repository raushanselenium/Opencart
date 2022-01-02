package apachePOI;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcelFromArrayList {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("Employee");
		ArrayList<Object[]> empdata=new ArrayList<Object[]>();
		empdata.add(new Object[] {"Empid","Name","Job"});
		empdata.add(new Object[] {101,"David","Engineeer"});
		empdata.add(new Object[] {102,"Smith","Advocate"});
		empdata.add(new Object[] {103,"Scott","Dcotor"});
		int r=0;
		for(Object[] emp:empdata)
		{
			XSSFRow row=sheet.createRow(r++);
			int c=0;
			for(Object e:emp)
			{
				XSSFCell cell=row.createCell(c++);
				if(e instanceof String)
					cell.setCellValue((String)e);
				if(e instanceof  Integer)
					cell.setCellValue((Integer)e);
				if(e instanceof Boolean)
					cell.setCellValue((Boolean)e);
			}	
		}
		String filepath=".\\src\\main\\java\\emp.xlsx";
		FileOutputStream fos=new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}

}
