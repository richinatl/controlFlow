package controlFlow;


public class Ascii {
	
	
      //The first step in the project is to create a separate class that will print valid characters to the user.  
	  //This will be a simple utility class that is called from the `main()` method to print valid character sets to the user.
	  //The skeleton of the class should resemble the following:
		
	  public static void printNumbers() {
	    // TODO: print valid numeric input
		  System.out.println("Numeric inputs accepted are: ");
		  for (char i = 48; i <+57; i++) {
			  System.out.print((char)i);
			  
		  }
		  
		  System.out.println();
		  System.out.println("");
	  }

	  public static void printLowerCase() {
	    // TODO: print valid lowercase alphabetic input
		  System.out.println("Lower case inputs accepted are: ");
		  for (char i = 97; i <= 122; i++) {
			  System.out.print((char)i);
		  }
		  
		  System.out.println();
		  System.out.println("");
	  }

	  public static void printUpperCase() {
	    // TODO: print valid uppercase alphabetic input
		  System.out.println("Upper case inputs accepted are: ");
		  for (char i = 65; i <= 90; i++) {
			  System.out.print((char)i);
		  }
		  
		  System.out.println();
		  System.out.println("");
	  }
	
	  
	
	

}
