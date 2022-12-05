package controlFlow;

import java.util.Scanner;



public class ControlFlow {

	public class UserInterface {
		// need to collect data from user
		// store the answers in variables
		// perform mathematical operations to get lottery numbers
		// create method to select magic 8 ball number
		// display to user
		// ask if they want to play again or terminate program
		
		

	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);		
		System.out.println("Hey there world!");
		
		System.out.println("Please enter you're name: ");
		String name = input.nextLine();
		System.out.println("Welcome, let's find your lucky numbers " + name);
		System.out.println("First a few rules:");
		System.out.println("");
		
		Ascii.printNumbers();
		Ascii.printUpperCase();
		Ascii.printLowerCase();
		
		System.out.println("Are you ready to get started? y for yes or n for no: ");
		String option = input.nextLine();
		
		if (option.equals("y")) {
			int playAgain = 0;
			while (playAgain == 0) {
				// collect data from user
				System.out.println("Do you have a red car (yes or no) ");
				String carColor = input2.nextLine();
				System.out.println("");
				
				System.out.println("What is your pet's name? (ex spot, rover..");
				String petName = input2.nextLine();
				System.out.println("")
				;
				System.out.println("How old is your pet?");
				int petAge = input.nextInt();
				System.out.println("");
				
				System.out.println("What is your lucky number? ");
				int luckyNumber = input.nextInt();
				System.out.println("");
				
				System.out.println("What is your favorite quarterback's jersey number? ");
	            int jerseyNumber = input.nextInt();
	            System.out.println("");
	            
	            System.out.println("What is the last two number's of your car's year model (ex. 16) ");
	            int modelYear = input.nextInt();
	            System.out.println("");
	            
	            System.out.println("What is the first name of your favorite actor? (ex Liam ");
	            String actorName = input2.nextLine();
	            System.out.println("");
	            
	            System.out.println("Enter a random number between 1 and 50 ");
	            int userNumber = input.nextInt();
	            System.out.println("");
	            
	            
	            // set limits on numbers
	            final int MIN_RANDOM = 1;
	            final int MAX_RANDOM = 65;
	            final int MIN_MAGIC = 1;
	            final int MAX_MAGIC = 75;
	            
	            // generate 3 random numbers
	            int random1 = (int) (Math.random() * 10);
	            int random2 = (int) (Math.random() * 10);
	            int random3 = (int) (Math.random() * 10);
	            
	            int magicBall = luckyNumber * random3;
	            if (magicBall > MAX_MAGIC) {
	            	magicBall = magicBall - MAX_MAGIC;
	            }
	            
	            int lottery1 = modelYear + luckyNumber;
	            if (lottery1 > MAX_RANDOM) {
	            	lottery1 = lottery1 - MAX_RANDOM;
	            }
	            
	            int lottery2 = 42;
	            if (lottery2 > random1) {
	            	lottery2 = random1;
	            }
	            
	            int lottery3 = userNumber - random2;
	            if (lottery3 <= 0) {
	            	lottery3 = MIN_RANDOM + 1;
	            }
	            
	            int lottery4 = petAge + modelYear;
	            if (lottery4 > MAX_RANDOM) {
	            	lottery4 = lottery4 - MAX_RANDOM;
	            }
	            
	            int lottery5 = petAge + jerseyNumber + luckyNumber;
	            if (lottery5 > MAX_RANDOM) {
	            	lottery5 = lottery5 - MAX_RANDOM;
	            }
	            
	            
	            // output to console
	            System.out.println("...Drum roll...");
	            System.out.println("");
	            System.out.println("");
	            System.out.println("Your winning numbers are:");
	            System.out.println("Lottery numbers: " + lottery1 + " " + lottery2 + " " + lottery3 + " " + lottery4 + " " + lottery5 + " " + "Your magic number is: " + magicBall);
	            System.out.println("Would you like to go again? ");
	            String answer = input2.nextLine();
	            
	            if (answer.equals("y")) {
	            	playAgain = 0;
	            }
	            
	            else if (answer.equals("n")) {
	            	playAgain++;
	            	System.out.println("Sorry to see you go!");
	            	System.out.println("Goodbye");
	            }
	            
	            }
		}
		else if (option.equals("n")){
			System.out.println("Please return later to complete the survey ");
			input.close();
			input2.close();		}
	   } 
    }
}
