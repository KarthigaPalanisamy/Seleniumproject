package apachepoi;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File src=new File("F:/Karthiga/Testing Training/excelfile/readexcel.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowcount=sheet.getLastRowNum();
		int columncount=sheet.getRow(0).getLastCellNum();
		for(int i=0;i<rowcount;i++){
			for(int j=0;j<columncount;j++)
			{
				String value=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
			}
		}
		
		
		
		

	}

}
