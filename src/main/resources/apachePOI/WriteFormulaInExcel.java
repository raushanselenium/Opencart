package apachePOI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteFormulaInExcel {

	public static void main(String[] args) throws IOException {

		String filepath = ".\\src\\main\\java\\books.xlsx";
		FileInputStream fis = new FileInputStream(filepath);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		sheet.getRow(7).getCell(2).setCellFormula("SUM(C2:C6)");
		fis.close();
		
		FileOutputStream fos=new FileOutputStream(filepath);
		wb.write(fos);
		wb.close();
		fos.close();
		System.out.println("Done");

		/*int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		int requiredcolumn = 0, sum = 0;

		XSSFRow row = sheet.getRow(0);
		for (int c = 0; c < cols; c++) {
			XSSFCell cell = row.getCell(c);
			if (cell.getStringCellValue().equalsIgnoreCase("price")) {
				requiredcolumn = c;
				break;
			}
		}
		for (int r = 1; r <= rows; r++) {
			if (r != rows) {
				row = sheet.getRow(r);
				sum += row.getCell(requiredcolumn).getNumericCellValue();
			} else {
				r++;
				row.getCell(r).setCellValue((Integer)sum);
			}

		}*/
	}

}
