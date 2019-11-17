import java.io.*;
import java.util.Scanner;

class Tugas1 {
    public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            FileWriter fWrite = null;
            PrintWriter printw = null;
            FileReader file = null;
            BufferedReader reader = null;
      
            try {
               System.out.println("input file awal :");
               String first = sc.next();    
               System.out.println("input file duplikat :");                                       
               String second = sc.next();                                           //Copied n aligned File
   
               file = new FileReader(String.format("%s.txt",first));
               reader = new BufferedReader(file);

               fWrite = new FileWriter(String.format("%s.txt", second));
               printw = new PrintWriter(fWrite);

               String cek;
               while ((cek = reader.readLine()) != null) {
                  printw.write(cek);
               }
            } catch (IOException ioe){
               System.out.println("Gagal");
               
            } finally {
               try {
                  if (fWrite != null){
                     System.out.println("Berhasil");
                     fWrite.close();
                  } 
                  if (file != null){
                     file.close();
                  }
               } catch (IOException ioe){
                  System.out.println(ioe.getMessage());
               }
            }
         }
      }