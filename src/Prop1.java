import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Prop1 {

	public static void main(String[] args) throws IOException {
		
		File propfile = new File("Config\\Emp_Details.properties");
		
		Properties prop = new Properties();
		
		FileInputStream FIS = new FileInputStream(propfile);
		
		prop.load(FIS);

		System.out.println(prop.getProperty("Name"));
		
		System.out.println(prop.getProperty("Place"));
		
		System.out.println(prop.getProperty("Designation"));
		
		System.out.println(prop.getProperty("Experience"));
	}

}
