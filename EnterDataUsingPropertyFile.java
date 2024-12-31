package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnterDataUsingPropertyFile {

	public static void main(String[] args) throws Throwable {
	   File file=new File(".\\src\\test\\resources\\Demo.properties");
	   FileInputStream fis=new FileInputStream(file);
	   Properties p=new Properties();
	   p.load(fis);
	   
	   String url=p.getProperty("url");
	   String user=p.getProperty("username");
	   String password=p.getProperty("password");
	   
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.get(url);
	   

	}

}
