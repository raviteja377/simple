package Vtiger.practice;

import java.io.IOException;

import vtiger.GenericUtility.JavaUtility;
import vtiger.GenericUtility.PropertyFileUtility;

public class JavaUtilityPractice {

	public static void main(String[] args) throws IOException {
JavaUtility Jlib=new JavaUtility();
int ra	=Jlib.getRandomNumber();
System.out.println(ra);
String d=Jlib.getSystemDate();
System.out.println(d);
String da=Jlib.getSystemDateFormat();
System.out.println(da);
PropertyFileUtility plib=new PropertyFileUtility();
String b = plib.readdatafrompropertyfile("browser");
System.out.println(b);     
	}

}
