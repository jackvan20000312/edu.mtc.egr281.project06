package project06;
//Jacob Vaught
//Due-10-05-2020
//Date-10-07-2020
//plays a game with the user. can guess the user's number in a few guesses


import java.util.Scanner;

public class Project06 {

		public static void main(String[] args) {
			
			//Prepare
			
			//declare scanner object
			Scanner keyboard = new Scanner(System.in);
			//declare variable to count guesses
			int numberOfGuesses=0;
			//store number of users guesses
			int cOMPUTERGuess;
			//initially, 999
			int upperbounds=1000;
			//initially, 0
			int lowerbounds=0;
			int number_2=2;
			int previouscomputerguess=1100;
			String uSERInput;
			//INPUT and Process
			
			//Prompt user to make guess
			System.out.println("Think of a number between 0 and 999:");
			System.out.print("Press Enter to continue . . . .");
			keyboard.nextLine();
		    
			do {
			//calculates the average of 2 numbers.
			cOMPUTERGuess=(upperbounds+lowerbounds)/number_2;
			//prints the average of 2 numbers
			System.out.println("Is it " +cOMPUTERGuess+ "?");
			
			//Gives you instructions
			System.out.println("(Enter y if it is,\n" + 
							   "l if your number is lower,\n" + 
							   "or h if your number is higher.)" );
			//user input from keyboard
			uSERInput=keyboard.next();
			
			//determines if player is cheating
			if(previouscomputerguess==cOMPUTERGuess || numberOfGuesses == 11) {
				System.out.print("Do Not Cheat!");
				System.exit(0);
			}
			
			//if user input contains l, increase computer guess
			else if(uSERInput.contains("l")) {
				++numberOfGuesses;
				upperbounds=cOMPUTERGuess;
				previouscomputerguess=cOMPUTERGuess;
			}
			
			//if user input contains h, decrease computer guess
			else if(uSERInput.contains("h")) {
				++numberOfGuesses;
				lowerbounds=cOMPUTERGuess;
				previouscomputerguess=cOMPUTERGuess;
			}
			
			//if user input is equal to computer guess, then congratulate the computer
			else if(uSERInput.contains("y")) {
				++numberOfGuesses;
				System.out.println("I guessed your number, "+cOMPUTERGuess+" in " +numberOfGuesses+" guesses.");
				
			}
			//if user input doesn't contains l,h, or y, TRY AGAIN
			else {
				System.out.print("Enter y, l, or h only! Try again:");
			}
			
			
			//continue loop until correct answer
			} while(!uSERInput.contains("y"));
			
			//output number of guesses and the random number
			//close scanner object
			keyboard.close();
		//Ending Bracket of method main
		}
		//ennding bracket of class
	}
