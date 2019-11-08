import java.util.Scanner;

class LatihanLab5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hitung = 0;
        String kata[] = new String[n];
        String konversi = "";
        boolean cari = false;
        
        String balik = "";
        for (int i = 0; i < kata.length; i++) {
            kata[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            konversi = kata[i];
            for (int j = konversi.length()-1; j >= 0; j--) {
                balik += konversi.charAt(j);
            }
            if (konversi.equals(balik)) {
                cari = true;
                hitung++;
            }
            balik = "";
        }

        if (cari == true) {
            System.out.println(hitung);
        }


    }
}