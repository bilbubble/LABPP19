import java.util.Scanner;

class TugasLab3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usia = sc.nextInt();
        waktu(usia);
    }
    public static void waktu(int usia) {
        System.out.println(tahun(usia) + " tahun");
        System.out.println(bulan(usia) + " bulan");
        System.out.println(hari(usia) + " hari");
    }
    public static int tahun(int usia) {
        int tahun = (usia/ 365);
        return tahun;
    }
    public static int bulan(int usia) {
        int bulan = (usia % 365 / 30);
        return bulan;
    }
    public static int hari(int usia) {
        int hari = (usia % 365 % 30);
        return hari;
    }
}