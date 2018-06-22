package propertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path = "C:\\Users\\APODDER\\Desktop\\Angcon Podder Desktop\\ALL  TRAINING\\Selenium\\JAVA\\JavaDevWorkSpace\\readingProperties\\src\\propertiesFile\\test.properties";

		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(path);

		prop.load(fs);
		System.out.println(prop.getProperty("name"));
		
		
		
		
	}

}
