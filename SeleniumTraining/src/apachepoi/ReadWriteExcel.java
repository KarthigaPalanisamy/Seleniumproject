package apachepoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("F:/Karthiga/Testing Training/excelfile/writeexcel.xlsx");
		FileInputStream fis=new FileInputStream(file);
		FileOutputStream fos=null;
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowcount=sheet.getLastRowNum();
		//System.out.println("Total number of rows:" +rowcount);
		for(int i=0;i<rowcount+1;i++){
			double value1=sheet.getRow(i).getCell(0).getNumericCellValue();
			System.out.println(value1);
			double value2=sheet.getRow(i).getCell(1).getNumericCellValue();
			System.out.println(value2);
			double sum=value1+value2;
			System.out.println("The sum is:"+sum);
			Row row=sheet.getRow(i);
			Cell cell=row.createCell(2);
			cell.setCellValue(sum);
			//cell.s
			 fos=new FileOutputStream(file);
			wb.write(fos);
						
			
		}
		fis.close();
		fos.close();
		System.out.println("The calculation is done successfully");
	}

}
