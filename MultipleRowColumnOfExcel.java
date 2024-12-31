package DataDriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleRowColumnOfExcel {

	public static void main(String[] args) throws Throwable {
		File file=new File(".\\src\\test\\resources\\MultipleRowsColumns.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook work=WorkbookFactory.create(fis);
		Sheet sheet=work.getSheet("Practice");
		
		int rownum=sheet.getPhysicalNumberOfRows();
		int colnum=sheet.getRow(0).getPhysicalNumberOfCells();
		
		for(int i=0;i<rownum;i++)
		{
			for(int j=0;j<colnum;j++)
			{
				String data=sheet.getRow(i).getCell(j).toString();
				System.out.println(data+" ");
			}
			System.out.println();
		}

	}

}
