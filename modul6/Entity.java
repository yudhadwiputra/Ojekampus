/**
 * Write a description of class Entity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Entity implements Wear
{
    protected String name;
    protected String weapon;
    protected String armor;
    protected int level;
    protected int health;
    protected int maxHP;
    protected int strength;
    protected double weaponDmg;
    protected double armorDef;
    protected double attack;
    protected double defense;
    protected boolean dead;
    protected Rank rank;

    
    public Entity(String name, int level){
        this.name=name;
        this.level=level;
        fullHP();
    }
    
    protected void levelup(){
        level=level++;
        fullHP();
    }
    
    protected void setHP(double diff){
        health=health-1;
        if(health==0){
            isDead();
        }
    }
    
    protected int getDamage(double def, double opRank){
        int damage = (int)(1+(((((2*level)/5)+2)*rank.getAttackPower()*(attack/def))/50))
        *(int)opRank*(int)rank.getRank();
        return damage;
    }
    
    protected void setPower(){
        attack = strength*(1+(weaponDmg/100));
        defense = strength*(1+(armorDef/100));
    }
    
    protected String getName(){
        return name;
    }
    
    protected int getLevel(){
        return level;
    }
    
    protected int getHP(){
        return health;
    }
    
    protected boolean isDead(){
        return true;
    }
   
    protected void setRank(Rank rank){
        this.rank=rank; 
    }
    
    protected Rank getRank(){
        return rank;
    }
    
    protected double getAttack(){
        return attack;
    }
    
    protected double getDefense(){
        return defense;
    }
    
    public void setWeapon(String name, double dmg){
        this.name=name;
        this.weaponDmg=dmg;
        setPower();
    }
    
    public String getWeapon(){
        return weapon;
    }
    
    public void setArmor(String name, double def){
        
    }
    
    public String getArmor(){
        return armor;
    }
    
    public double getWeaponDmg(){
        return weaponDmg;
    }
    
    public double getArmorDef(){
        return armorDef;
    }
    
    protected void fullHP(){
        
    }
    
    protected void quote(){
        
    }
}