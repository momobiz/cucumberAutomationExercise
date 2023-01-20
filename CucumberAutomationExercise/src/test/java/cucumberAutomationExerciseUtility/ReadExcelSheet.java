package cucumberAutomationExerciseUtility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet {
	
	public static Map<String,String> readData(String sheetName,int rowNumber) throws InvalidFormatException, IOException {
		
		File fs=new File("data/automationExerciseData.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sheet=wb.getSheet(sheetName);
		XSSFCell cell;
		
		int rows=sheet.getPhysicalNumberOfRows();
		int columns=sheet.getRow(0).getLastCellNum();
		
		
	    List<HashMap<String, String>> data=new ArrayList<HashMap<String, String>>();
	    HashMap<String,String> data1;
	    
	    for(int i=1;i<rows;i++) {
	    	data1=new HashMap<>();
	    	for (int j=0;j<columns;j++) {
	    		cell=sheet.getRow(i).getCell(j);
	    		String key=sheet.getRow(0).getCell(j).toString();
	    		if(cell==null) data1.put(key," ");
	    		else data1.put(key, cell.toString());
	    	}
	    	data.add(data1);
	    }
	   
	    wb.close();
	    return data.get(rowNumber);
	}


}
