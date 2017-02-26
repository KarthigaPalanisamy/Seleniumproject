package TestNGdemo;


import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	static XSSFWorkbook wb;
	static XSSFSheet ws;
	static XSSFRow row;
	static XSSFCell cell;
	static int rowNum;
	static int colNum;
	static String[][] data;
	
	public static String[][] ReadExcelData(String excel,String sheetname) throws Exception{
		
		FileInputStream fis= new FileInputStream(excel);
		wb= new XSSFWorkbook(fis);
		ws= wb.getSheet(sheetname);
		
		rowNum = ws .getLastRowNum() +1;
		colNum = ws.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowNum][colNum];
		System.out.println("reading");
		
		for(int i=0; i<rowNum; i++){
			row = ws.getRow(i);
			for(int j=0; j<colNum; j++){
				cell= row.getCell(j);
				String Value="-";
				 if (cell !=null){
					 Value= cellToString(cell);
					 
				 }
				 data[i][j] = Value;
				 
			}
		}
		return data;
		
	}
	
public static void setCellData(String excel, String Result, int RowNum, int ColNum) throws Exception{
	
		row= ws.getRow(RowNum);
		cell= row.getCell(ColNum,row.RETURN_BLANK_AS_NULL);
		System.out.println("writing");
		if(cell == null){
			cell = row.createCell(ColNum);
			cell.setCellValue(Result);
		} else
		{
			cell.setCellValue(Result);
		}
		
		FileOutputStream fileout = new FileOutputStream(excel);
		wb.write(fileout);
		fileout.flush();
		fileout.close();
		
		}

public static String cellToString(XSSFCell cell){
	
	int type;
	Object result;
	type = cell.getCellType();
	
	switch(type){
		
	case 0://numeric Value in Excel
		result=cell.getNumericCellValue();
		break;
	
	case 1://String Value in Excel
		result=cell.getStringCellValue();
		break;
	default:
		throw new RuntimeException("There is no support for this type");
	}
	return result.toString();	
	}

}
