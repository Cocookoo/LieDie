
/**
 * This is the Die class (Every player gets X amount).
 * @author Thomas Yang
 */
public class Die {
	//the number that the die is
	private int num;
	/**
	 * The constructor for the die (Num is 0 if not rolled)
	 */
	public Die(){
		num = 0;
	}
	
	/**
	 * a public method that allows players to roll their die
	 */
	public void roll(){
		num = (int)(Math.random()*6+1);
	}
	
	/**
	 * a public method to return the die number to the player
	 * @return num
	 */
	public int getNum(){
		return this.num;
	}
}