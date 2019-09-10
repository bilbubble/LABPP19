import java.util.Scanner;

public class TugasPraktikum1{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         double efisiensi = 14;
         int waktuTempuh = sc.nextInt();
         int kecepatan = sc.nextInt();

         double hasil = (waktuTempuh *kecepatan)/efisiensi;
         System.out.printf("Bensin Yang Digunakan %.3f", hasil);
         System.out.println(" L ");
     }
 }