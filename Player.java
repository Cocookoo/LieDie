import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Player class (There are a maximum of 8 players in one game)
 * @author Thomas Yang
 */
public class Player {
	//the amount of dice the player has
	private int diceAmt;
	private String name;
	private ArrayList<Die> dieList;
	
	/**
	 * The constructor for the player class
	 */
	public Player(String n){
		name = n;
		diceAmt = 5;
		dieList = new ArrayList<Die>();
		for(int i = 0; i < diceAmt; i++){
			dieList.add(new Die());	
		}
	}
	
	/**
	 * When someone says they would like to call out a player or not (with deadon enabled)
	 * @return a string of Y, N, or D. (Yes, No, DeadOn)
	 */
	public String callOut(){
		String choice = "";
		System.out.println("Would you like to call the player out? (Y,N, or D)");
		Scanner in = new Scanner(System.in);
		while(!choice.equals("Y") || !choice.equals("N")){
			try{
				choice = in.next();
			}
			catch(InputMismatchException e){
				System.out.println("Invalid input. Please reenter \"Y\" or \"N\":");
			}
		}
		in.close();
		return choice;
	}
	
	/**
	 * This function allows the player to call an amount and dice side
	 * If someone calls them out, the game compares and evaluates who loses the die
	 * @return a call object that contains the amount and dice side
	 */
	public Call AmtNumCall(){
		int amount = 0;
		int side = 0;
		System.out.println("What is your amount call (1-40)?");
		Scanner in = new Scanner(System.in);
		//hard coded (please find better way)
		//Implying there will be a max of 8 players with 5 die
		//a range of 1-40 is valid
		while(amount < 1 || amount > 40){
			try{
				amount = in.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println("Invalid input. Please reenter (1-40):");
			}
		}
		System.out.println("What is your die side call (1-6)?");
		//range of 1-6
		while(side < 1 || side > 6){
			try{
				side = in.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println("Invalid input. Please reenter (1-6):");
			}
		}
		in.close();
		return (new Call(amount, side));
	}
	
	/**
	 * this function gets rid of one of the player's die (called wrong)
	 */
	public void loseDie(){
		dieList.remove(diceAmt);
		diceAmt--;
	}
	
	/**
	 * returns the amount of die that the player has left
	 * @return diceAmt the amount of die player has left
	 */
	public int getAmtDie(){
		return diceAmt;
	}
	
	/**
	 * The player rolls the die that he/she has
	 * @return a string that has the die rolls on it
	 */
	public String roll(){
		String playerRoll = "[";
		for(int i = 0; i < getAmtDie(); i++){
			Die d = dieList.get(i);
			d.roll();
			if(i != getAmtDie()-1){
				playerRoll+= d.getNum() + ", ";	
			}
			else{
				playerRoll+= d.getNum() + "]";
			}
		}
		return playerRoll;
	}
	/**
	 * Returns the list of die (Used by the game to count the number of die)
	 * @return dieList
	 */
	public ArrayList<Die> getDieList(){
		return dieList;
	}
	
	public String getName(){
		return name;
	}
}