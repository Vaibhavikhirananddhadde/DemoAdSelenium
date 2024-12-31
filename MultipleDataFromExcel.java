package DataDriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleDataFromExcel {

	public static void main(String[] args) throws Throwable {
		File file=new File(".\\src\\test\\resources\\MultipleRows.xlsx.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook work=WorkbookFactory.create(fis);
		Sheet sheet=work.getSheet("Practice");
		
		int rownum=sheet.getPhysicalNumberOfRows();
		
		for(int i=0;i<=rownum;i++)
		{
			String data=sheet.getRow(i).getCell(0).toString();
			System.out.println(data);
		}

	}

}
