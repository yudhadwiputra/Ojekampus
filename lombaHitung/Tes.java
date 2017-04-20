package lombaHitung;
import java.*;
import java.util.*;

/**
 * Write a description of class Tes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tes
{
   private static int[] arrayDelay = new int[3];
   public static void main(String args[]) {
      int i;
      for(i=0;i<3;i++)
      {
          arrayDelay[i] = random();
      }
      arrayDelay = sorting(arrayDelay);
      LombaHitung R1 = new LombaHitung( "Tomi", arrayDelay[2]);
      R1.start();
      
      arrayDelay = sorting(arrayDelay);
      LombaHitung R2 = new LombaHitung( "Tomo", arrayDelay[1]);
      R2.start();
      
      arrayDelay = sorting(arrayDelay);
      LombaHitung R3 = new LombaHitung( "Toma", arrayDelay[0]);
      R3.start();
   }   
   
   public static int random(){
      //untuk menghasilkan angka random
      Random rand = new Random();
      return rand.nextInt(100)+1;
   }
   
   public static int[] sorting(int[] arr){
      //untuk sorting angka random yang dihasilkan
      for (int i = 0; i < arr.length - 1; i++)
      {
          int index = i;
          for (int j = i + 1; j < arr.length; j++)
              if (arr[j] < arr[index])
                  index = j;
      
         int smallerNumber = arr[index]; 
         arr[index] = arr[i];
         arr[i] = smallerNumber;
        }
        return arr;
    }
}
