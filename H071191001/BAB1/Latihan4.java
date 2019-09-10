import java.util.Scanner;

public class Latihan4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int seratusRibu = (a / 100000);
        int sisa1 = a % 100000;

        int limapuluhRibu = (sisa1 / 50000);
        int sisa2 = (sisa1 % 50000);

        int duapuluhRibu = (sisa2 / 20000);
        int sisa3 = (sisa2 % 20000);

        int sepuluhRibu = (sisa3 / 10000);
        int sisa4 = (sisa3 % 10000);

        int limaRibu = (sisa4 / 5000);
        int sisa5 = (sisa4 % 5000);

        int duaRibu = (sisa5 / 2000);
        int sisa6 = (sisa5 % 2000);

        int seRibu = (sisa6 / 1000);
        int sisa7 = (sisa6 % 1000);

        System.out.println("Jumlah uang Rp.100.000 = "  + seratusRibu);
        System.out.println("Jumlah uang Rp.50.000 = " + limapuluhRibu);
        System.out.println("Jumlah uang Rp.20.000 = " + duapuluhRibu);
        System.out.println("JUmlah uang Rp.10.000 = " + sepuluhRibu);
        System.out.println("Jumlah uang Rp.5000 = " + limaRibu);
        System.out.println("Jumlah uang Rp.2000 = " + duaRibu);
        System.out.println("Jumlah uang Rp.1000 = " + seRibu);
    }
}