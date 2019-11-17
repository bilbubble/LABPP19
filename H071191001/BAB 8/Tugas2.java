import java.util.Scanner;
import java.io.*;
class Tugas2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      FileWriter fWrite = null;
      PrintWriter printw = null;
      FileReader file = null;
      BufferedReader reader = null;

      try {
         System.out.println("masukkan file awal :");
         String first = sc.next();                                             
         System.out.println("masukkan file akhir :");
         String second = sc.next();                                           
        
         file = new FileReader(String.format("%s.txt",first));
         reader = new BufferedReader(file);
         fWrite = new FileWriter(String.format("%s.txt", second));
         printw = new PrintWriter(fWrite);

         String s;
         int max = 0;
         while ((s = reader.readLine()) != null){
            max = s.length() > max ? s.length() : max;                        //rata kanan ikuti barisan terpanjang
            
         }
         file = new FileReader(String.format("%s.txt",first));
         reader = new BufferedReader(file);

         String cek;
         while ((cek = reader.readLine()) != null) {
            printw.write(String.format("%"+max+"s\n", cek));
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