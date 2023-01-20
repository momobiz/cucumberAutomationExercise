package cucumberAutomationExerciseUtility;

public class ConvertNumberFromSheet {
	public static String convert(String stringNumber) {
		  String str2=null;
		  int i=0;
		   while(i<stringNumber.length() && stringNumber.charAt(i)!='.') {
			   i++;
			   
		   }
		    
		   return stringNumber.substring(0,i);
	}
	
	 
	

}
