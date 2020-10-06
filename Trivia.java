import java.util.Scanner;
public class TriviaProject {

	private static Scanner input;

	public static void main(String[] args) {
		Scanner playerInput;
		playerInput = new Scanner(System.in);
        String playerName;
		System.out.println("Welcome");
		System.out.println("This is a Trivia Game. Each question you get right your score will go up.");
		System.out.println("You will not be penalized for each question you get wrong.");
		boolean restart = true;
		while(restart == true)
		{
		System.out.println("TYPE IN YOUR CHARACTER NAME:");
		playerName = playerInput.nextLine();
		System.out.println("Now that your set up "  + playerName + " lets get right into the Trivia. Press Enter to continue.");
		playerInput.nextLine();
		int score=0;
		int trys = 3;
		boolean a = true;
		boolean b= true;
		boolean c = true;
		boolean d = true; 
		boolean dreamt = true;
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("The first question is...");
		System.out.println("Chris Pine plays the role of which character in the 2016 sci-fi film 'Star Trek Beyond'?");
		System.out.println("a. Leonard McCoy");
		System.out.println("b. James T. Kirk");
		System.out.println("c. Pavel Chekov");
		System.out.println("d. Spock");
		System.out.println("");
		String answer;
		input = new Scanner(System.in);
		while(b==true){
			
			answer = input.nextLine();
			if(answer.equalsIgnoreCase("a")){
				System.out.println("Thats incorrect!");
				score +=5;
				System.out.println("Your score is: " + score);
				b = false;
			}
			else if(answer.equalsIgnoreCase("b")){
				System.out.println("Thats correct!");
				score +=20;
				System.out.println("Your score is: " + score);
				b = false;
			}
			else if(answer.equalsIgnoreCase("c")){
				System.out.println("Thats incorrect!");
				score +=10;
				System.out.println("Your score is: " + score);
				b = false;
			}
			else if(answer.equalsIgnoreCase("d")){
				System.out.println("Thats incorrect!");
				score +=15;
				System.out.println("Your score is: " + score);
				b = false;
			}
			else{
				System.out.println("Error please choose an answer from a-d:");
			}
		}
		System.out.println("Press Enter for next question...");
		playerInput.nextLine();
		b = true;
		
		System.out.println("In what year was the Nintendo 64 officially released?");
		System.out.println("a. 1988");
		System.out.println("b. 1993");
		System.out.println("c. 1996");
		System.out.println("d. 1990");
		System.out.println("");
		
		while(c==true)
		{
			 answer = input.nextLine();
			if(answer.equalsIgnoreCase("a")){
				System.out.println("Thats incorrect!");
				score +=5;
				System.out.println("Your score is: " + score);
				c = false;
			}
			else if(answer.equalsIgnoreCase("b")){
				System.out.println("Thats incorrect!");
				score +=10;
				System.out.println("Your score is: " + score);
				c = false;
			}
			else if(answer.equalsIgnoreCase("c")){
				System.out.println("Thats correct!");
				score +=20;
				System.out.println("Your score is: " + score);
				c = false;
			}
			else if(answer.equalsIgnoreCase("d")){
				System.out.println("Thats incorrect!");
				score +=10;
				System.out.println("Your score is: " + score);
				c = false;
			}
			else{
				System.out.println("Error please choose an answer from a-d:");
			}
		}
		System.out.println("Press Enter for next question...");
		input.nextLine();
		c= true;
		
		System.out.println("What type of dog is Scooby Doo from the cartoon series, 'Scooby Doo'? ");
		System.out.println("a. English Mastiff");
		System.out.println("b. Great Dane");
		System.out.println("c. Cane Corso");
		System.out.println("d. Newfoundland");
		System.out.println("");
		while(b==true){
			
			answer = input.nextLine();
			if(answer.equalsIgnoreCase("a")){
				System.out.println("Thats incorrect!");
				score +=10;
				System.out.println("Your score is: " + score);
				b = false;
			}
			else if(answer.equalsIgnoreCase("b")){
				System.out.println("Thats correct!");
				score +=20;
				System.out.println("Your score is: " + score);
				b = false;
			}
			else if(answer.equalsIgnoreCase("c")){
				System.out.println("Thats incorrect!");
				score +=10;
				System.out.println("Your score is: " + score);
				b = false;
			}
			else if(answer.equalsIgnoreCase("d")){
				System.out.println("Thats incorrect!");
				score +=15;
				System.out.println("Your score is: " + score);
				b = false;
			}
			else{
				System.out.println("Error please choose an answer from a-d:");
			}
		}
		System.out.println("Press Enter for next question...");
		input.nextLine();
		b=true;
		
		System.out.println("Which Planet is the largest planet in the solar system?");
		System.out.println("a. Mars");
		System.out.println("b. The Sun");
		System.out.println("c. Uranus");
		System.out.println("d. Jupiter");
		System.out.println("");
		while(d==true){
			
			answer = input.nextLine();
			if(answer.equalsIgnoreCase("a")){
				System.out.println("Thats incorrect!");
				score +=10;
				System.out.println("Your score is: " + score);
				d = false;
			}
			else if(answer.equalsIgnoreCase("b")){
				System.out.println("Thats incorrect! Did you really just answer 'the Sun'.");
				score -=10;
				System.out.println("Your score is: " + score + " You lost 10 points for that answer.");
				d = false;
			}
			else if(answer.equalsIgnoreCase("c")){
				System.out.println("Thats incorrect!");
				score +=10;
				System.out.println("Your score is: " + score);
				d = false;
			}
			else if(answer.equalsIgnoreCase("d")){
				System.out.println("Thats correct!");
				score +=20;
				System.out.println("Your score is: " + score);
				d = false;
			}
			else{
				System.out.println("Error please choose an answer from a-d:");
			}
		}
		System.out.println("Press Enter for next question...");
		input.nextLine();
		d=true;
		
		System.out.println("In the board game Monopoly, if you pay to get out of jail, how much does it cost?");
		System.out.println("a. 50$");
		System.out.println("b. 100$");
		System.out.println("c. 150$");
		System.out.println("d. 200$");
		System.out.println("");
		while(a==true){
			
			answer = input.nextLine();
			if(answer.equalsIgnoreCase("a")){
				score +=5;
				System.out.println("Your score is: " + score);
				System.out.println("Thats correct!");
				a = false;
			}
			else if(answer.equalsIgnoreCase("b")){
				System.out.println("Thats incorrect!");
				a = false;
			}
			else if(answer.equalsIgnoreCase("c")){
				System.out.println("Thats incorrect!");
				a = false;
			}
			else if(answer.equalsIgnoreCase("d")){
				System.out.println("Thats incorrect!");
				a = false;
			}
			else{
				System.out.println("Error please choose an answer from a-d:");
			}
			
		}
		System.out.println("Press Enter for next question...");
		input.nextLine();
		a=true;
		
		System.out.println("What is the most popular drink in the world that does not contain alcohol?");
		System.out.println("a. Water duh");
		System.out.println("b. Soda");
		System.out.println("c. Coffee");
		System.out.println("");
		while(c==true){
			
			answer = input.nextLine();
			if(answer.equalsIgnoreCase("a")){
				System.out.println("Thats incorrect!");
				c = false;
			}
			else if(answer.equalsIgnoreCase("b")){
				System.out.println("Thats incorrect!");
				c = false;
			}
			else if(answer.equalsIgnoreCase("c")){
				System.out.println("Thats correct!");
				score +=30;
				System.out.println("Your score is: " + score);
				c = false;
			
			}
			else{
				System.out.println("Error please choose an answer from a-c:");
			}
		}
			System.out.println("Press Enter for next question...");
			input.nextLine();
			c=true;
		
			System.out.println("Sound travels faster through water or steel?");
			System.out.println("a. Water");
			System.out.println("b. Steel");
			System.out.println("");
			while(b==true){
				
				answer = input.nextLine();
				if(answer.equalsIgnoreCase("a")){
					System.out.println("Thats incorrect!");
					b = false;
				}
				else if(answer.equalsIgnoreCase("b")){
					score +=50;
					System.out.println("Your score is: " + score);
					System.out.println("Thats correct!");
					b = false;
				}
				else{
					System.out.println("Error please choose an answer from a or b:");
				}
			}
			System.out.println("Press Enter for next question...");
			input.nextLine();
			b=true;
			
			System.out.println("What is the only word in English ending in the letters 'mt'.");	
			System.out.println("You have 4 trys.");
			System.out.println("Type the word below:");
			System.out.println("");
				while(dreamt==true && trys>0){
					
					answer = input.nextLine();
					if(answer.equalsIgnoreCase("dreamt")){
						System.out.println("Thats correct!");
						score +=200;
						System.out.println("Your score is: " + score);
						dreamt = false;
					}
					else{
						System.out.println("Thats incorrect! you have " + trys + " " + "left.");
						trys--;
					}
				}				
			System.out.println("Press Enter for next question...");
			input.nextLine();
				dreamt=true;
				
				System.out.println("Which is the only vowel on a standard keyboard that is not on the top line of letters?");
				System.out.println("You have 1 try.");
				System.out.println("Type the letter below:");
				System.out.println("");
				while(a==true){
					
					answer = input.nextLine();
					if(answer.equalsIgnoreCase("a")){
						System.out.println("Thats correct!");
						score+=5;
						System.out.println("Your score is Currently: " + score);
						a = false;
					}
					else{
						System.out.println("Thats incorrect!");
					}
				}
					System.out.println("Press Enter for next question...");
					input.nextLine();
					a=true;
					
					System.out.println("Do you know which child star Mila Kunis dated for eight years?");
					System.out.println("a. Jonathan Lipnicki");
					System.out.println("b. Haley Joel Osment");
					System.out.println("c. Macaulay Culkin");
					System.out.println("d. Ben Savage");
					System.out.println("");
					
					while(c==true)
					{
						 answer = input.nextLine();
						if(answer.equalsIgnoreCase("a")){
							System.out.println("Thats incorrect!");
							score +=5;
							System.out.println("Your score is: " + score);
							c = false;
						}
						else if(answer.equalsIgnoreCase("b")){
							System.out.println("Thats incorrect!");
							score +=10;
							System.out.println("Your score is: " + score);
							c = false;
						}
						else if(answer.equalsIgnoreCase("c")){
							System.out.println("Thats correct!");
							score +=20;
							System.out.println("Your score is: " + score);
							c = false;
						}
						else if(answer.equalsIgnoreCase("d")){
							System.out.println("Thats incorrect!");
							score +=10;
							System.out.println();
							c = false;
						}
						else{
							System.out.println("Error please choose an answer from a-d:");
						}
					}
					System.out.println("Press Enter to display your score...");
					
					
					
					
					System.out.println(playerName + " You have scored " + score + " points.");
					input.nextLine();
					c= true;
					String res;
					System.out.println("Enter 1 to try again and 2 to quit");
					res = input.nextLine();
					if(res.equals("1"))
					{
						restart = true;
					}
					else
					{
						restart = false;
						System.exit(0);
					}
					
				
	}
	}
}





	


