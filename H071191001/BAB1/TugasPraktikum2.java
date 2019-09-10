import java.util.Scanner;

public class TugasPraktikum2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int detik = sc.nextInt();

        int jam = (detik / 3600);
        int sisa1 = detik % 3600;

        int menit = (sisa1 / 60);
        int sisa2 = sisa1 % 60;

        int detikk = sisa2;

        //System.out.println (jam + " :" + menit + " :" + detikk);
        System.out.printf("%02d:%02d:%02d", jam, menit, detikk);
    }
}