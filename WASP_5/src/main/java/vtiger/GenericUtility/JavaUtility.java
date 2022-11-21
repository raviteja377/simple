package vtiger.GenericUtility;

import java.util.Date;
import java.util.Random;
import java.util.RandomAccess;

/**
 * This class contains all the java specific generic methods
 * @author raviteja
 *
 */
public class JavaUtility {
  public int getRandomNumber() {
	 Random r=new Random();
	 int ran= r.nextInt(1000);
	return ran;  }

public String getSystemDate() {
	Date date= new Date();
	String d=date.toString();
	return d;
	}
public String getSystemDateFormat() {
	Date d=new Date();
	String[] dArray=d.toString().split(" ");
	String date = dArray[2];
	String month = dArray[1];
	String year = dArray[5];
	String time = dArray[3].replace(":", "-"); 
String currentdateandtime = date+" "+month+" "+year+" "+time;
return currentdateandtime;
	
}}