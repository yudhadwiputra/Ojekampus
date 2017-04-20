package lombaHitung;
import java.*;
import java.util.*;


/**
 * Write a description of class LombaHitung here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LombaHitung implements Runnable {
   private Thread t;
   private String threadName;
   private int delay;
   
   
   LombaHitung(String name, int delay) {
      threadName = name;
      this.delay = delay;
      System.out.println(threadName + " Hadir");
   }
   
   public void run() {
      System.out.println(threadName + " Mulai Menghitung");
      try {
         for(int i = 0; i < 24; i++) {
            System.out.println("Kontestan " + threadName + " Menghitung " + i);
            // Let the thread sleep for a while.
            Thread.sleep(delay);
         }
      }catch (InterruptedException e) {
         System.out.println("Kontestan " +  threadName + " interrupted.");
      }
      System.out.println("Kontestan " +  threadName + " Selesai Menghitung");
   }
   
   public void start () {
      System.out.println(threadName + " Bersiap");
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
}


