package vtiger.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


/**
 * this class contains all generic methods related to excel excel sheet
 * @author Raviteja
 *
 */
public class ExcelFileUtility {
	/**
	 * This metod  will read data from excel sheet with sheet name,row  and cell number
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws IOException
	 */
	public String readDataFromExcel(String sheet,int row,int cell)throws  IOException {
FileInputStream fis=new FileInputStream(IConstantsUtility.excelfilepath);
Workbook wb = WorkbookFactory.create(fis);
Sheet s = wb.getSheet(sheet);
Row r = s.getRow(row);
Cell c = r.getCell(cell);
String value = c.getStringCellValue();
wb.close();
fis.close();
return value;
}
	/**
	 * This method will return the total number of rows in the sheet
	 * @param sheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public int getRowCount(String sheet) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(IConstantsUtility.excelfilepath);
		Workbook wb=WorkbookFactory.create(fis);
	Sheet s=wb.getSheet(sheet);
	int lastRow=s.getLastRowNum();
	return lastRow;  }
	/**
	 * This method will write data into excel sheet
	 * @param sheet
	 * @param row
	 * @param cel
	 * @param value
	 * @throws Throwable
	 */
	public void writeDataIntoExcel(String sheet,int row,int cel,String value) throws Throwable {
		FileInputStream fis= new FileInputStream(IConstantsUtility.excelfilepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(sheet);
Row r = s.getRow(row);
Cell c = r.getCell(cel);
c.setCellValue(value);
FileOutputStream fos=new FileOutputStream(IConstantsUtility.excelfilepath);
wb.write(fos);
wb.close();
	}
	
}
