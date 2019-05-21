package march26;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

 
public class ReadData_ExcelFile {
 
 public static void main(String []args){
  
  try {
  // Specify the path of file
  File src=new File("C:\\Users\\Pradeep R V S\\Desktop\\Vienna Plan.xlsx");
 
   // load file
   FileInputStream fis=new FileInputStream(src);
 
   // Load workbook
   XSSFWorkbook wb=new XSSFWorkbook(fis);
   
   // Load sheet- Here we are loading first sheetonly
   		int noOfSheets= wb.getNumberOfSheets();
   		System.out.println(noOfSheets);
   		XSSFSheet sheet= wb.getSheetAt(0);
   		int rowCount=sheet.getLastRowNum();
   		System.out.println(rowCount);
   		Iterator<Row> rows = sheet.iterator();
   		while(rows.hasNext()) {
   			Row row= rows.next();
   			Iterator<Cell> cells=row.iterator();
   			while(cells.hasNext()) {
   				System.out.print(cells.next()+" ");
   			}
   			System.out.println();
   		}
      
 
  } catch (Exception e) {
 
   System.out.println(e.getMessage());
 
  }
  
 }
 
}