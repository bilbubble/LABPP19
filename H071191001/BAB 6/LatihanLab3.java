import java.util.Scanner;

class LatihanLab3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kalimat = sc.nextLine();
        int panjangKalimat = kalimat.length();
        String klp1;
        String klp2;

        //pengkondisian ganjil genap
        if (panjangKalimat % 2!= 0) {
            klp1 = kalimat.substring(0, ((panjangKalimat/2)+1));
            klp2 = kalimat.substring((panjangKalimat/2)+1);
        } else{
            klp1 = kalimat.substring(0, (panjangKalimat/2));
            klp2 = kalimat.substring((panjangKalimat/2));
        }

        //membalik kata klp2
        String balikKlp2 = "";
        for (int i = klp2.length()-1; i >= 0; i--) {
            balikKlp2 = balikKlp2 + klp2.charAt(i);
        }

        System.out.println(balikKlp2.toUpperCase());

        //menggeser huruf klp1 sebanyak 3 kali
        char[] c = klp1.toCharArray();
        for (int i = 0; i < klp1.length(); i++) {
            if (c[i] + 3 >= 97 && c[i] + 3 <= 122 ) {
                c[i] += 3;
            } else{
                c[i] += 3;
            }

        }

        //konversi char ke string
        String str = String.valueOf(c);
        System.out.println((balikKlp2+str).toUpperCase());

    }
}