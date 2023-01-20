
Feature: To test registration functionality
     
 
  Scenario Outline: To register new user 
   Given user launchs "chrome" browser 
   When  user opens the homePage 
   Then  Verify that home page is visible successfully
   When  user clicks on Signup/Login button
   Then  Verify New User Signup! is visible
   When  user enters his name and email from "<sheet2>" through <rowNumber>
   And   use clicks Signup button
	 Then  Verify that ENTER ACCOUNT INFORMATION is visible
   When  user fills details: Title, Name...from "<sheet3>" through <rowNumber>
   And   user selects checkbox of newsletter! "<sheet3>" through <rowNumber>
   And   user selects checkbox to receive or not special offers from our partners! "<sheet3>" through <rowNumber>
   And   user  Fills the rest of details like Firstname, Lastname...from "<sheet3>" through <rowNumber>
   And   user clicks on Create Account button
   Then  Verify that ACCOUNT CREATED! is visible
   When  user clicks on Continue button
   Then  Verify that Logged in as username is visible "<sheet2>" through <rowNumber>
   When  user clicks on Delete Account button
   Then  Verify that ACCOUNT DELETED! is visible
   And   user clicks on Continue button to confirm the delete of account

   
   Examples:
   |sheet2 |sheet3     |rowNumber|
   |Feuil2 |Feuil3	   |	0		   | 
  
   
  
  

  