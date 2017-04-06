package modul6;
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
    protected boolean dead = false;
    protected Rank rank;

    
    public Entity(String name, int level){
        this.name=name;
        this.level=level;
        fullHP();
    }
    
    protected void levelup(){
        level=level+1;
        fullHP();
    }
    
    protected void setHP(double diff){
        health -= diff;
        if(health <= 0){
            dead = true;
        }
    }
    
    protected double getDamage(double def, double opRank){
        double damage;
        damage = (1+(((((2*level)/5)+2)*rank.getAttackPower()*(attack/def))/50))
        *opRank*rank.getRank();
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
        return dead;
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
        weapon = name;
        weaponDmg = dmg;
        setPower();
    }
    
    public String getWeapon(){
        return weapon;
    }
    
    public void setArmor(String name, double def){
        armor = name;
        armorDef = def;
        setPower();
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
    
    protected abstract void fullHP();
    
    protected abstract void quote();
}