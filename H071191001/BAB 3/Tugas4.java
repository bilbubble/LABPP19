import java.util.Scanner;

class Tugas4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan harga :");
        int harga = sc.nextInt();
        System.out.println("masukkan uang :");
        int uang = sc.nextInt();
        int kembalian = uang - harga;
        int seratusK = 0;
        int limapuluhK = 0;
        int duapuluhK = 0;
        int sepuluhK = 0;
        int limaK = 0;
        int duaK = 0;
        int satuK = 0;

        for (int i = 1; i <= 7; i++) {
            if (kembalian - 100000 >= 0) {
            kembalian -= 100000;
            seratusK++;

            }else if (kembalian - 50000 >= 0){
                kembalian -= 50000;
                limapuluhK++;

            } else if (kembalian - 20000 >= 0){
                kembalian -= 20000;
                duapuluhK++;

            }else if (kembalian - 10000 >= 0){
                kembalian -= 10000;
                sepuluhK++;

            }else if (kembalian - 5000 >= 0){
                kembalian -= 5000;
                limaK++;

            }else if (kembalian - 2000 >= 0){
                kembalian -= 2000;
                duaK++;

            }else if (kembalian - 1000 >= 0){
                kembalian -= 1000;
                satuK++;
            }
        }
        System.out.println(seratusK + " uang Rp. 100.000");
        System.out.println(limapuluhK + " uang Rp. 50.000");
        System.out.println(duapuluhK + " uang Rp. 20.000");
        System.out.println(sepuluhK + " uang Rp. 10.000");
        System.out.println(limaK + " uang Rp. 5.000");
        System.out.println(duaK + " uang Rp. 2.000");
        System.out.println(satuK + " uang Rp. 1000");
    }
}