package modul6;
/**
 * Write a description of class Monster here.
 * Kelas Monster berisi kriteria dari monster
 * @author (Yudha Dwi Putra) 
 * @version (07/04/17)
 */
public class Monster extends Entity
{
           /**
     * Constructor Monster 
     * Metode yang menginisialisasi musuh
     * @param String name
     * @param int level
     */
    public Monster(String name, int level)
    {
        super(name,level); 
    }

          /**
     * Method quote
     * Metode yang melakukan print quote monster
     */
    public void quote()
    {
        System.out.println("Raaaawwwwwrrrrrrrr!!!!!");
    }
    
              /**
     * Method fullHP
     * Metode yang melakukan penghitungan maxHP monster
     */
    public void fullHP()
    {
        maxHP = (((level*level)/10)+5);
        strength = (((level*level)/10)+5)/2;
        health = maxHP;
        setPower();
    }
}