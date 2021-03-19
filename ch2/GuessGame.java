
public class GuessGame {

	Player p1;
	Player p2;
	Player p3;
	
	public void startGame() {
		
		//creating 3 players
		
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		//declaring variable to hold player guesses
		
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		//initializing each player's guess to false
		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		//generating a random number, this is the target number
		
		int targetNumber = (int)(Math.random() * 10);
		
		System.out.println("I am thinking of a number between 0 and 9 ...");
		
		while(true) {
			
			System.out.println("The number to guess is: " + targetNumber);
			
			//saving each player's guess
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			//displaying each player's guess
			
			guessp1 = p1.number;
			System.out.println("Player 1 guessed " + guessp1);
			
			guessp2 = p2.number;
			System.out.println("Player 2 guessed " + guessp2);
			
			guessp3 = p3.number;
			System.out.println("Player 3 guessed " + guessp3);
			
			//checking if targetNumber matches with each player's guess
			
			if(guessp1 == targetNumber) {
				p1isRight = true;			//setting player1's guess to true
			}
			
			if(guessp2 == targetNumber) {
				p2isRight = true;			//setting player2's guess to true
			}
			
			if(guessp3 == targetNumber) {
				p3isRight = true;			//setting player3's guess to true
			}
			
			//if any player's guess matches with the targetNumer, then displaying winner
			
			if(p1isRight || p2isRight || p3isRight) {
				
				System.out.println("We have a winner!");
				System.out.println("Player 1 got it right? " + p1isRight);
				System.out.println("Player 2 got it right? " + p2isRight);
				System.out.println("Player 3 got it right? " + p3isRight);
				System.out.println("Game is over");
				break;
			}
			
			//if there's no match, then asking players to guess again
			
			else {
				System.out.println("Players will have to try again");
			}
		}

	}
}
