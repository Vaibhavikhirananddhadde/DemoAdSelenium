package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadingDataFromPropertyFile {

	public static void main(String[] args) throws Throwable {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Demo.properties");
		p.load(fis);
		String url =(String)p.get("url");
		System.out.println(url);
		String username =(String)p.get("username");
		System.out.println(username);
		String password =(String)p.get("password");
		System.out.println(password);
		

	}

}
