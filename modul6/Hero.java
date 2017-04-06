package modul6;
/**
 * Write a description of class Hero here.
 * Kelas Hero berisi kriteria dari hero
 * @author (Yudha Dwi Putra) 
 * @version (07/04/17)
 */
public class Hero extends Entity
{
               /**
     * Constructor Hero
     * Metode yang menginisialisasi hero
     * @param String name
     * @param int level
     */
    public Hero(String name, int level)
    {
        super(name,level); 
    }

              /**
     * Method quote
     * Metode yang melakukan print quote hero
     */
    public void quote()
    {
        System.out.println("Aku Jagoan");
    }
    
                  /**
     * Method fullHP
     * Metode yang melakukan penghitungan maxHP hero
     */
    public void fullHP()
    {
        maxHP=(15*level+5)/4;
        strength=(15*level+5)/8;
        health = maxHP;
        setPower();
    }
}
