package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiesUtil {

	public static Properties properties = new Properties();
	static FileInputStream fis;

	public static Properties loadApplicationProperties() {

		

		// FileInputStream fis = null;
		try {
			fis = new FileInputStream("src/test/java/config/application.properties");
			properties.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}

	public static Properties loadFrameworkProperties() {

		

		try {
			fis = new FileInputStream("src/test/java/config/framework.properties");
			properties.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}

	public static Properties loadUserProperties() {

		

		try {
			fis = new FileInputStream("src/test/java/config/user.properties");
			properties.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}

}
