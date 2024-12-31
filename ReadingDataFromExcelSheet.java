package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDataFromExcelSheet {
	public static void main(String[] args) throws Throwable {
		File file=new File(".\\src\\test\\resources\\Demo.xlsx.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook work=WorkbookFactory.create(fis);
		Sheet sheet=work.getSheet("Practice");
		
		String data=sheet.getRow(0).getCell(0).toString();
		System.out.println(data);
	}

}
