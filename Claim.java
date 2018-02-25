/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shrinath
 */
public class Claim {
    private int diceNum;
    private int diceVal;
    
    public void setNum(int n){
        diceNum = n;
    }
    
    public void setVal(int n){
        diceVal = n;
    }
    
    public int getNum(){
        return diceNum;
    }
    
    public int getVal(){
        return diceVal;
    }
}
