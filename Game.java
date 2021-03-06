import java.util.ArrayList;
import java.util.Scanner;
/**
 * The game class contains 2-8 players each with 5 die
 * The game is liar's die. Use semaphores for turns and when people call out!
 * @author Thomas Yang
 */
public class Game {
	private ArrayList<Player> players;
	
	/**
	 * 
	 * @param amtPlayers
	 */
	public Game(int amtPlayers){
		players = new ArrayList<Player>();
		Scanner in = new Scanner(System.in);
		
		//this loop asks players for their names and instantiates them
		for(int i = 0; i < amtPlayers; i++){
			String name = "";
			System.out.println("Enter a name:");
			while(name.isEmpty()){
				name = in.next();
			}
			players.add(new Player(name));
		}
		in.close();
//		for(Player p: players){
//			System.out.println(p.getName());
//		}
		run();
	}
	public void run(){
		
	}
	
	//compare is called once a player calls somebody out (this leads to check what they want to call out for)
	//Player.callOut() ->  
	// if the person who makes the call is correct then it will return true
	public boolean compare(Call c){
		//running total of the die that was called
		int numCall = 0;
		//loop through each player
		for(int i = 0; i < players.size(); i++){
			Player p = players.get(i);
			//look through each players dice count?
			ArrayList<Die> dieList = p.getDieList();
			for(int j = 0; j < p.getAmtDie(); j++){
				if(dieList.get(j).getNum() == c.getNum()){//if the number of the specific die is the same as the call
					numCall++;
					if(numCall<c.getAmt()){
						return false;
					}
				}
			}
		}

		if(numCall < c.getAmt()){
			return false;
		}
		return true;
	}
}
