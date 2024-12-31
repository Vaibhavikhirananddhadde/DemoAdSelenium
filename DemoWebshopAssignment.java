package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWebshopAssignment {

	public static void main(String[] args) throws Throwable, Throwable {
		File file=new File(".\\src\\test\\resources\\Assignment.xlsx.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook work=WorkbookFactory.create(fis);
		Sheet sheet=work.getSheet("Ass1");
		
		String url=sheet.getRow(1).getCell(0).toString();
		String FirstName=sheet.getRow(1).getCell(1).toString();
		String lastName=sheet.getRow(1).getCell(2).toString();
		String email=sheet.getRow(1).getCell(3).toString();
		String password=sheet.getRow(1).getCell(4).toString();
		String confirm=sheet.getRow(1).getCell(5).toString();
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.id("FirstName")).sendKeys(FirstName);
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirm);
		
		

	}

}
