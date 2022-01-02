package apachePOI;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HashmapToExcel {

	public static void main(String[] args) throws IOException {
		
		String path=".\\src\\main\\java\\resource.xlsx";
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("resourceData");
		int rownum=0;
		HashMap<String,String> data=new HashMap<String,String>();
		data.put("101", "Raushan");
		data.put("102", "Swati");
		data.put("103", "Ranjit");
		for(Map.Entry<String, String> entry : data.entrySet())
		{
			XSSFRow row=sheet.createRow(rownum++);
			row.createCell(0).setCellValue(entry.getKey());
			row.createCell(1).setCellValue(entry.getValue());
		}
		FileOutputStream fos=new  FileOutputStream(path);
		wb.write(fos);
		wb.close();
		fos.close();
		
		

	}

}
