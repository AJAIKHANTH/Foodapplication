package Team.Swiggy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel { 
	String filepath ="C:\\Excel_1\\EXCEL_2.xlsx";
	
	public void Read_1() throws IOException {
		 File f = new File(filepath);
		 FileInputStream fs = new FileInputStream(f);
		 XSSFWorkbook workbook = new XSSFWorkbook(fs);
		 Sheet sh = workbook.getSheet("Hotels");
		 int totalrows = sh.getPhysicalNumberOfRows();
		 for(int i = 0;i<totalrows; i++) {
			 Row eachrow = sh.getRow(i);
			 int totalcol = eachrow.getLastCellNum();
			 for(int j = 0; j< totalcol; j++) {
				 Cell eachcell = eachrow.getCell(j);
				 String actualval =  eachcell.getStringCellValue();
				 
//				 if(actualval.equalsIgnoreCase(Hotelname)) {
//					 System.out.println("available");
				 System.out.print(actualval+" ");

				 }
			 System.out.println();
			 
			 }
		fs.close();
		 }
		
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ReadExcel N = new ReadExcel();
		N.Read_1();
	}

}
