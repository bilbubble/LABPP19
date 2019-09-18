import java.util.Scanner;

class TugasPraktikum2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jamAwal = sc.nextInt();
        int menitAwal = sc.nextInt();
        int jamAkhir = sc.nextInt();
        int menitAkhir = sc.nextInt();
        
        int durasi1 = 0;
        int durasi2 = 0;
        int jam = 0;

        int hasil1 = ((jamAwal * 3600) + (menitAwal * 60));
        int hasil2 = ((jamAkhir * 3600) + (menitAkhir * 60));
       
        if (hasil2 > hasil1) {
            durasi1 = hasil2 - hasil1;
            System.out.printf("%02d:%02d",durasi1/3600,(durasi1%3600)/60);
        }else{
            durasi2 = hasil1 - hasil2;
            jam = 86400 - durasi2;
            System.out.printf("%02d:%02d" ,jam/3600,(jam%3600)/60);
        }
    }
}