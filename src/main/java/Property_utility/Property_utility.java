package Property_utility;

import java.io.FileInputStream;
import java.util.Properties;

public class Property_utility {
	
	static String path="D:\\eclipse\\work_Eat\\Property file\\Propertiesdata.properties";
	public static String getProperty(String key)
	{
		String value="";
		try
		
		{
			FileInputStream fis=new FileInputStream(path);
			Properties prop=new Properties();
			prop.load(fis);
			value=prop.getProperty(key);
		}
		catch(Exception e)
		{
			System.out.println("Issue in getProperty"+e);
		}
		return value;
	}
}
