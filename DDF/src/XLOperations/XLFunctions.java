package XLOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLFunctions {
	
	
	public static XSSFWorkbook wb=null;
	public static XSSFSheet ws=null;
	public static XSSFRow row=null;
	public static XSSFCell cell=null;
	public static FileInputStream fin=null;
	
	public static void setExcel(String XLFile, String sheet) throws IOException
	{
		fin=new FileInputStream(XLFile);
		wb=new XSSFWorkbook(fin);
		ws=wb.getSheet(sheet);
		
		
	}
	
	public static int RowsCount()
	{
		int rowscount=ws.getLastRowNum()+1;
		return rowscount;
		
		
	}
	
	public static String getExcelData(int rows, int col)
	{
		
		row=ws.getRow(rows);
		cell=row.getCell(col);
		String value=cell.getStringCellValue();
		return value;
		
		
	}
}
