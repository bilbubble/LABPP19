import java.util.Locale;
import java.util.Scanner;

class Tugas5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        
        while (sc.hasNextDouble()) {
        double input = sc.nextDouble();
        System.out.println();
        double derajat = 240;
        double hasil = input * derajat;
        double x = hasil / 3600;
        double jam = x + 6;
        int menit = (int) (hasil % 3600) /60;
        int detik = (int) (hasil % 3600)%60 ;
        double y;

        if (jam >= 12 && jam < 15) {
            System.out.println("selamat siang");
        } else if (jam >= 16 && jam < 18) {
            System.out.println("selamat sore");
        } else if (jam >= 18 && jam <= 24){
            System.out.println("selamat malam");
        } else {
            System.out.println("selamat pagi");
        }
        
        if (jam > 24) {
            y = jam - 24;
            System.out.printf("%02.0f:%02d:%02d" , y, menit, detik);
            System.out.println();
        }else {
            System.out.printf("%02.0f:%02d:%02d" , jam, menit, detik);
            System.out.println();
        } 
        }
    }
}