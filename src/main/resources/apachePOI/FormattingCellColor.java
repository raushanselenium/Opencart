package apachePOI;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FormattingCellColor {

	public static void main(String[] args) {
	
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("colour");
		XSSFRow row=sheet.createRow(0);
		XSSFCell cell=row.createCell(0);
		XSSFCellStyle style=wb.createCellStyle();
		//style.setFillBackgroundColor(XSSFColor.toXSSFColor());

	}

}
