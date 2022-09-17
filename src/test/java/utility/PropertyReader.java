package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	private static Properties obj_Properties;
private static  String PropertyFilename;
private static  FileInputStream obj_fileFileInputStream;
	public PropertyReader(String PropertyFilename)
	{
	PropertyReader.PropertyFilename=PropertyFilename;
	}
	public Properties  propertyReader() {
		try {
		  obj_fileFileInputStream=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/properties/"+PropertyFilename+".properties");
		} catch (FileNotFoundException e) {
			System.out.println(" oreiii yedavaaa path check chesuko");
		}	
		
		  obj_Properties=new Properties();
		try {
			obj_Properties.load(obj_fileFileInputStream);
		} catch (IOException e) {
			 System.out.println("oreiii yedavaaa path check chesuko ");
		}
		
	return  obj_Properties;	
	}
}
