package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DataFetching 
{
	public static String uname;
	public static 	String pwd; 
	public static String invalid_uname;
	public void data() throws EncryptedDocumentException, IOException
	{
		FileInputStream s = new FileInputStream("C:\\Eclipse\\Amazon_POM\\Exel\\Credentials.xlsx");
		Workbook w = WorkbookFactory.create(s);
		 uname = NumberToTextConverter.toText(w.getSheet("Usernames").getRow(1).getCell(0).getNumericCellValue());
		//String pwd = w.getSheet("Password").getRow(1).getCell(0);
		 pwd = w.getSheet("Password").getRow(1).getCell(0).getStringCellValue();
		 invalid_uname = w.getSheet("Usernames").getRow(0).getCell(0).getStringCellValue();
		 
	}

}
