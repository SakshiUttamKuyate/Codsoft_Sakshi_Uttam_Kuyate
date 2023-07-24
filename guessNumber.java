package Codsoft;

import java.util.Random;
import java.util.Scanner;

class Game{
	int computer;
	public Game() {                                     //constructor
		Random r=new Random();                          //generating random number from computer
		computer=r.nextInt(100);
		System.out.println("Guess the number from 1 to 100!");
	}
	public int computerNumber() {                      //method
		return computer;
	}
}

public class guessNumber {

	static int userInput(){                           //static method
		int user;
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		user=sc.nextInt();
		return user;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user,computer,maximumAttempts=6,score=0;
		Scanner p=new Scanner(System.in);
		boolean correctGuessing=false,playAgain=true;
		Game g=new Game();
		while(playAgain)
		{
			int attempts=0;
			
			while(attempts<maximumAttempts) {
				
				user=userInput();
				attempts++;
				computer=g.computerNumber();
				if(user==computer){
					System.out.println("Congratulations!! ");
					System.out.println("you guessed the correct number :) ");
					correctGuessing=true;	
					break;
				}
				else if(user>computer) {
					System.out.println("Sorry!!");
					System.out.println("its too high, Try again.");              //number is bigger than computer number
					
				}
				else {
					System.out.println("Sorry!!");
					System.out.println("its too low, Try again.");             //number is smaller than computer number
					
				}
	
			}
			if(!correctGuessing) {
				System.out.println("Sorry you used all attempts");
				System.out.println("the answer is : "+g.computer);
			}
			score+=correctGuessing ? 1:0;                                       //scoring count
			System.out.println("do you want to play again??  (y/n) : ");
			String playAgainIn=p.next().toLowerCase();
			playAgain=playAgainIn.equals("y");

		}		
		System.out.println("Game Over ...");
		System.out.println("your score is : "+score);


	}

}
