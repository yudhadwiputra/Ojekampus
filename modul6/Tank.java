/**
 * Write a description of class Tank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tank implements Rank
{
    private String attackName;
    private int attackPower;
    private static double rank=0.8;

    public Tank(String name, int power)
    {
       
    }
   
    public void setAttackName(String name)
    {
        // put your code here
    }
    
    public String getAttackerName()
    {
        return attackName;
    }
    
    public void setAttackPower(int power)
    {
        
    }
    
    public int getAttackPower()
    {
        return attackPower;
    }
    
    public double getRank()
    {
        return rank;
    }    
}