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
}
