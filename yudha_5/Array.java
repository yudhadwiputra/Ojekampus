package yudha_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/**
 * Merupakan main program dari sorting array untuk membandingkan array dengan arraylist
 * 
 * @author (Yudha Dwi Putra) 
 * @version (23 Mar 2017)
 */
public class Array
{
    private static final String FILENAME = "C:/Users/User/Desktop/OOP.txt";
    private static ArrayList<Integer> listInt = new ArrayList<>();
    private static int[] arrayInt = new int[1000];
    public Array()
    {

    }

    public void main(){
         try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
             String sCurrentLine;
             int i = 0;
             while ((sCurrentLine = br.readLine()) != null) {
                 arrayInt[i] = Integer.parseInt(sCurrentLine);
                 listInt.add(Integer.parseInt(sCurrentLine));
                 i++;
             }
         }
         catch (IOException e) {
             e.printStackTrace();
         }
       /* ArrayList<Integer> listInt = new ArrayList<Integer>();
        listInt.add(283);
        listInt.add(157);
        listInt.add(634);
        listInt.add(766);
        listInt.add(763);
        listInt.add(896);
        listInt.add(460);
        listInt.add(726);
        listInt.add(392);
        listInt.add(182);
       // int[] arrayInt = new int[]{283,157,634,766,763,896,460,726,392,182};*/
        long start = System.nanoTime();        
        Collections.sort(listInt);
        System.out.println("Sorted List Arrays");
        for(int number1 : listInt){
            System.out.println("number :" +number1);
        }
        long end = System.nanoTime();
        long total = end - start;
        System.out.println("Waktu(ns) = "+total);
        long start1 = System.nanoTime();
        sortArray(arrayInt);
        System.out.println("Sorted Arrays");
        for(int number : arrayInt){
            System.out.println("number :" +number);
        }
        long end1 = System.nanoTime();
        long total1 = end1 - start1;
        System.out.println("Waktu(ns) = "+total1);
        
    }

    public int[] sortArray(int[] arrayInt)
    {
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = i + 1; j < arrayInt.length; j++) {
                int tmp = 0;
                if (arrayInt[i] > arrayInt[j]) {
                    tmp = arrayInt[i];
                    arrayInt[i] = arrayInt[j];
                    arrayInt[j] = tmp;
                }
            }
        }
       return arrayInt;
    }
    
    public int[] sortListArray(int[] listInt)
    {
        for (int i = 0; i < listInt.length; i++) {
            for (int j = i + 1; j < listInt.length; j++) {
                int tmp = 0;
                if (listInt[i] > listInt[j]) {
                    tmp = listInt[i];
                    listInt[i] = listInt[j];
                    listInt[j] = tmp;
                }
            }
        }
       return listInt;
    }
    
}
