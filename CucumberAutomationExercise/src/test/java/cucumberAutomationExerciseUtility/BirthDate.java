package cucumberAutomationExerciseUtility;

import java.io.IOException;
import java.util.regex.Pattern;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class BirthDate {
	Pattern p=Pattern.compile("[-\\/,;_\\\\+*]");
	
	static String[] elementsOfDate;
	String[] months={"janvier","février","mars","avril","mai","juin","juillet","août","septembre","novembre","décembre"};
	
	
	public BirthDate(String dateOfBirth) {
		elementsOfDate=p.split(dateOfBirth);
	}
	
	public String generateDayOfBirth() {
		String day=elementsOfDate[0];
		if(day.charAt(0)=='0') day=day.substring(1);
		return day;
		
		
	}
	public String generateMonthOfBrith() {
		String month=elementsOfDate[1];
		System.out.println("month from sheet="+month);
		int index=-1;
		try {
			for(int i=0;i<months.length;i++) {
				if(months[i].contains(month.substring(0,month.length()-1))) {
					index=i+1;
				}
				}
			
		} catch (Exception e) {
			System.out.println("Enter a valid month of birth");
		}
		
		return String.valueOf(index);
		
		
	}
	
	public String generateYearOfBirth() {
		return elementsOfDate[2];
	}
	

	
	

}
