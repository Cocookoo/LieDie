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
	// if the person who makes the call is correct then it will return true
	public boolean compare(Call c){
		numCall = 0;
		for(int i = 0; i < players.length; i++){
			for(int j = 0; j < players[i].getDiceAmt(); j++){
				dieList[] = players.getDieList();
				if( dieList[j]== c.getNum()){//if the number of the specific die is the same as the call
					numCall++;
					if(!c.getDead()){
						if(numCall<= c.getAmt())
							return false;
					}
					else{
						if(numCall<c.getAmt())
							return false;
					}

				}
			}
		}

		if(numCall == c.getAmt())
			return true;
		else
			return false;

	}
}
