package yudha_5;


import java.util.*;
import java.io.*;

/**
 * Kelas OOP merupakan class utama untuk tugas 2 modul 5 dimana dimana terdapat program main yang dipanggil.
 * 
 * @author (Yudha Dwi) 
 * @version (3 Maret 2017)
 */
public class OOP
{
    // instance variables - replace the example below with your own
    private static ArrayList<Mahasiswa> siswa = new ArrayList<>();

   
    /**
     * OOP Constructor
     * Merupakan method yang pertama kali di panggil ketika sebuah object OOP diciptakan.
     * Method ini akan meminta input yang akan disimpan pada array list dari object.
     */
    public OOP()
    {
        System.out.println("Masukkan Input");
        Scanner scanner = new Scanner(System.in);
        String inputString = " ";
        boolean cekInput=false;
        int inputInt=0;
        while(true){
            inputString = scanner.nextLine();
            if(inputString.equals("q")){
                break;
            }
            inputInt = scanner.nextInt();
            scanner.nextLine();
            siswa.add(new Mahasiswa(inputString,inputInt));
        }
        
    }
        
    /**
     * Method main
     * Method utama yang akan dipanggil ketika program di compile.
     * program akan membuat sebuah object OOP yang akan meminta input pada array dari object
     * dan melakukan sorting pada array tersebut.
     */
    public static void main(){
        OOP oop1 = new OOP();
        System.out.println("Sebelum");
        System.out.println(siswa);
        Collections.sort(siswa);
        System.out.println("Sesudah");
        System.out.println(siswa);
    }
    
}
