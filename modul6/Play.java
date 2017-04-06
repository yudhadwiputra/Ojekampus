import java.util.*;

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play
{
    // instance variables - replace the example below with your own
    private Hero player;
    private Monster enemy;
    private Random rand;
    private int enemyCount;

    /**
     * Constructor for objects of class Play
     */
    private Play()
    {
        // initialise instance variables
 
    }
    
    private void initialize(){
        rand = new Random();
        player = new Hero("Yudha",1);
        player.setRank(setRank("Cimori", 100));
        player.setWeapon("Katanya", 50);
        enemyCount = 1;
        initializeEnemy();
    }
    
    private void initializeEnemy(){
    
    }
    
    private void print(int i){
    
    }
    
    private Rank setRank(String name, int power){
        Rank temp = null;
        if(player.getLevel()%3 == 1){
            Normal normal1 = new Normal(name,power);
            temp = normal1;
        }
        
        else if(player.getLevel()%3 == 2){
             Tank tank1 = new Tank(name,power);
             temp = tank1;
        }
        else if(player.getLevel()%3 == 0){
            Damager damager1 = new Damager(name,power);
            temp = damager1;
        }
        return temp;
    }
    
    private void attackTurn(Entity attacker, Entity defender){
    
    }
    
    public void main(String[] args){
    
    }
   
}