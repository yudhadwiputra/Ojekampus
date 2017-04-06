package modul6;

import java.util.*;

/**
 * Write a description of class Play here.
 * Kelas Play ini merupakan main class dari project yang terdiri constructornya 
 * sendiri dan method main. Pada kelas ini program utama dijalankan
 * @author (Yudha Dwi Putra) 
 * @version (06/04/2017)
 */
public class Play
{
    // instance variables - replace the example below with your own
    private Hero player;
    private Monster enemy;
    private Random rand;
    private int enemyCount;

    /**
     * Constructor modul6
     * merupakan method pertama yang akan dieksekusi pertama kali
     */
    private Play()
    {
    
        initialize();
        
        System.out.println("War start!" +
        "\nHero = " + player.getName() + ", level = " + player.getLevel() +
        "\nEnemy = " + enemy.getName() + ", level = " + player.getLevel());

       for (int i = 1; !player.isDead(); i++)
        {
           
            print(i);
            if(i%2 == 1){
                 attackTurn(player,enemy);
            }
            else{
                attackTurn(enemy,player);
            }
           
            if (enemy.isDead())
            {
                System.out.println("Enemy died! Spawning new enemy!");
                this.enemyCount = this.enemyCount+1;
                initializeEnemy();
                player.levelup();
                System.out.println("Player level up! Level = " + player.getLevel());
            }
    }

    System.out.println("Hero mati pada level " + player.getLevel());
 
    }
    
                      /**
     * Method initialize
     * Metode yang menginisialisasi hero
     */
    private void initialize(){
        rand = new Random();
        player = new Hero("Yudha",1);
        player.setRank(setRank("Jagoan Neon", 147));
        player.setWeapon("Pedang Neon", 70);
        enemyCount = 1;
        initializeEnemy();
    }
    
                  /**
     * Method initializeEnemy 
     * Metode yang menginisialisasi monster
     */
    private void initializeEnemy(){
        enemy = new Monster("Monster Nakal",enemyCount);
        //berikut adalah code untuk versi dengan kekuata random yang tidak dapat di prediksi
        //enemy.setRank(setRank("Saringan", rand.nextInt((100 - 50) + 1) + 50));
        //enemy.setWeapon("Mata", rand.nextInt((25 - 5) + 1)+5);
        //enemy.setArmor("Scale", rand.nextInt((25 - 5) + 1)+5);
        //code untuk hasil yang dapat di prediksi
        enemy.setRank(setRank("Gigitan Nakal",21));
        enemy.setWeapon("Mulut Nakal", 1);
        enemy.setArmor("Baju Gemes", 1);
    }
    
                  /**
     * Method print 
     * Metode untuk print data
     * @param  int i
     */
    private void print(int i){
        System.out.println("\nRound = " + i +
        "\nKill count = " + (enemyCount - 1) +
        "\nHero health = " + player.getHP() + ", Enemy health = " + enemy.getHP());
        // kode anda
        if(i%2 == 1){
            player.quote();
        }
        else{
            enemy.quote();
        }
    }
    
              /**
     * Method setRank. 
     * Metode yang menentukan jenis player.
     * @param  String name
     * @param  int power
     */
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
    
          /**
     * Method attackTurn. 
     * Metode yang memberikan nilai setHP.
     * @param  Entity attacker
     * @param  Entity defender
     */
    private void attackTurn(Entity attacker, Entity defender){
        int damage = (int)attacker.getDamage(defender.getDefense(),defender.getRank().getRank());
        System.out.println("damage: "+damage);
        defender.setHP(damage); 
    }
    
          /**
     * Method Main. 
     * Metode utama pada project modul6 yang akan dialankan ketika project di compile dan di run.
     * @param  String args[]    argumen yang diberikan untuk metode main.
     */
    public static void main(String args[]){
        Play demo1 = new Play();
    }
   
}