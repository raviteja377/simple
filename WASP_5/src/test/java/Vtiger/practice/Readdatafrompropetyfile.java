package Vtiger.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readdatafrompropetyfile {

	public static void main(String[] args) throws IOException 
	{Properties pobj=new Properties();
FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\commondata.properties");
pobj.load(fis);
System.out.println(pobj.getProperty("browser"));
System.out.println(pobj.getProperty("url"));
System.out.println(pobj.getProperty("username"));
System.out.println(pobj.getProperty("password"));}

}
