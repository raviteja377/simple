package vtiger.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * this class contains generic methods to read data from property file
 * @author raviteja
 *
 */
public class PropertyFileUtility{
	/**
	 * 	this method will read the specific key value from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readdatafrompropertyfile(String key) throws IOException {
		FileInputStream fis=new FileInputStream(IConstantsUtility.propertyfilepath);
	Properties pobj=new Properties();
	pobj.load(fis);
	String value=pobj.getProperty(key);
	return 	value;}
	

}
