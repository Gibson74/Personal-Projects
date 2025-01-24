/******************************************************************************
A short Rock paper scissors game I made, enjoy!
*******************************************************************************/
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
public class RPS
{
	public static void main(String[] args) {
		boolean replayLoop = true;
		while (replayLoop == true){
		Scanner scnr = new Scanner(System.in);
		Random rand = new Random();
		int randInt = rand.nextInt(3) + 1;
		int selection;
		int replay;
		//System.out.println(randInt);
		System.out.println("Welcome to rock paper scissors, please make your selection");
		printMenu();
		selection = inputValidation(scnr);
		computerChoice(randInt);
		result(selection, randInt);
		System.out.println("Do you want to play again?");
		System.out.println("Please select 0 if no and 1 if yes");
		replay = scnr.nextInt();
		if(replay == 0){
			System.out.println("Thank you for playing!");
			replayLoop = false;
		}
	}
	}
	public static void result(int user, int computer){
		switch(user){
			case 1:
			if(computer == 1){
				System.out.println("Tie");
			}
			else if(computer == 2){
				System.out.println("Computer wins");
			}
			else if(computer == 3){
				System.out.println("You win!");
			}
			break;
			case 2:
			if(computer == 1){
				System.out.println("You Win!");
			}
			else if(computer == 2){
				System.out.println("Tie");
			}
			else if(computer == 3){
				System.out.println("Computer wins");
			}
			break;
			case 3:
			if(computer == 1){
				System.out.println("Computer wins");
			}
			else if(computer == 2){
				System.out.println("You win");
			}
			else if(computer == 3){
				System.out.println("Tie");
			}
			break;
			default:
			System.out.println("Something went wrong, please try again later");
		}
	}
	public static void printMenu(){
		System.out.println("\n[Option 1: Rock]");
		System.out.println("\n[Option 2: Paper]");
		System.out.println("\n[Option 3: Scissors]");
	}
	public static void computerChoice(int choice){
		switch(choice){
			case 1: 
			System.out.println("Computer chose rock");
			break;
			case 2:
			System.out.println("Computer chose paper");
			break;
			case 3:
			System.out.println("Computer chose scissors");
			break;
		}
	}
	public static int inputValidation(Scanner scnr){
		int menuOption;
		while(true){
			try{
				menuOption = scnr.nextInt();
				if((menuOption != 1) && (menuOption != 2) && (menuOption != 3)){
					System.out.println("Invalid entry! please enter a number from 1 to 3");
					continue;
				}
				else
				break;
			}
			catch(InputMismatchException e){
				System.out.println("Invalid input! please enter a number from 1 to 3");
				scnr.nextLine();
			}
		}
		return menuOption;
	}
}
