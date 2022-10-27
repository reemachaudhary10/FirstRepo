import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Pankaj Singh\\eclipse-workspace\\Selenium\\src\\datadrieven\\Book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String url=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String username=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String password=wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		

	}

}
