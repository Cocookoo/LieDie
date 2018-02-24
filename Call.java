/**
 * This class keeps the call of the player
 * @author Thomas Yang
 */
public class Call {
	private int amt;
	private int num;
	private boolean dead;
	
	/**
	 * This constructor sets the amt and num
	 * @param amt the amount of die
	 * @param num the die side
	 */
	public Call(int amt, int num, boolean b){
		this.amt = amt;
		this.num = num;
		dead = b;
	}
	
	/**
	 * Sets the amount of die
	 * @param amt the amount of die
	 */
	public void setAmt(int amt){
		this.amt = amt;
	}
	
	/**
	 * Sets the side of die
	 * @param num the die side
	 */
	public void setNum(int num){
		this.num = num;
	}
	
	/**
	 * Gets the amount of die
	 * @return amt the amount of die
	 */
	public int getAmt(){
		return this.amt;
	}
	
	/**
	 * Gets the die side
	 * @return num the die side
	 */
	public int getNum(){
		return this.num;
	}

	public boolean getDead() { return this.dead; }
}