 package Vtiger.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Readdatafronexcel {
	@Test(dataProvider = "muldata")
public void  muldatausedataprovider(String org,String orgname) {
	System.out.println("org: "+org+" "+"orgname: "+orgname);
}
@Test
	public void readdatafromexcel() throws Exception {
//		File file=new File("G:\\eclipse mavanprojects\\WASP_5\\src\\test\\resources\\test1.xlsx");
		FileInputStream fis= new FileInputStream("G:\\eclipse mavanprojects\\WASP_5\\src\\test\\resources\\test1.xlsx");
		//XSSFWorkbook workbook=new XSSFWorkbook(fis);
//XSSFSheet sheet=workbook.getSheet("contact");
Workbook wb = WorkbookFactory.create(fis);
 Sheet sheet = wb.getSheet("organization");
String cellvalue=sheet.getRow(4).getCell(2).getStringCellValue();
System.out.println(cellvalue);
wb.close();
fis.close();}
@DataProvider(name="muldata")
public Object[][] getmuldata() throws Exception {
FileInputStream fis1=new FileInputStream(".\\excelsheets\\test.xls");
Workbook wb1 = WorkbookFactory.create(fis1);
Sheet sh1=wb1.getSheet("muldata");
int r1=sh1.getLastRowNum();
int c1=sh1.getRow(0).getLastCellNum();
Object[][] data=new Object[r1][c1]; 
for(int i=0;i<r1;i++) {
	for(int j=0;j<c1;j++) {
		data[i][j]=sh1.getRow(i+1).getCell(j).getStringCellValue();
	
	}
	
}
return data;
}
}
