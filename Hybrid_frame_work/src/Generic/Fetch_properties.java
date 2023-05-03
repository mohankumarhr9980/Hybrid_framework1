package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Fetch_properties {
	public static String get_properties() throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/Utils/p.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String a2 = pro.getProperty("baseurl");
		return a2;
		
	}

}
