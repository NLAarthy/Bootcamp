package bootcampprograms;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class ReadExcelData {

	public static void main(String[] args)throws IOException {
		XSSFWorkbook workBook = new XSSFWorkbook( "./data/login.xlsx");
		XSSFSheet sheet =workBook.getSheetAt(0);
		XSSFRow row =sheet.getRow(0);
		System.out.println("Total Row in the WorkBook:"+sheet.getLastRowNum());
		System.out.println("Total Column in the WorkBook:"+sheet.getRow(0).getLastCellNum());
		for(int i=0;i<sheet.getLastRowNum()+1;i++) {
			for(int j=0;j<sheet.getRow(i).getLastCellNum();j++) {
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());

			}
		}

				// TODO Auto-generated method stub

	}

}
