import java.util.Scanner;

class Tugas3{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int a = 0;
      int b = 1;
      int hasil = 0;
      int c = sc.nextInt();

      for (int i = 1; i <= c; i++) {
          a = b;
          b = hasil;
          System.out.print(hasil + " ");
          hasil = a + b;
      }
    }
}