/**
 * Write a description of class Damager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Damager implements Rank
{
    private String attackName;
    private int attackPower;
    private static double rank=1.25;
    
    public Damager(String name, int power)
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