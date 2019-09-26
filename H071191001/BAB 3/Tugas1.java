import java.util.Scanner;

class Tugas1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nol = 0;
        int x = sc.nextInt();
        int y = sc.nextInt();
        int terkecil;
        int terbesar;

        if (x < y) {
            terkecil = x;
            terbesar = y;
        } else if (x == y){
            terkecil = x;
            terbesar = y;
        } else {
            terkecil = y;
            terbesar = x;
        }

        for (int i = terkecil; i <= terbesar; i+=1) {
            if (i%2==0) {
                if (i == 0){
                    System.out.println(i + " nol");
                }
                else if (i > 0) {
                    System.out.println(i + " genap positif");
                }
                else{
                    System.out.println(i + " genap negatif");
                }
            } else{
                if (i > 0) {
                    System.out.println(i + " ganjil positif");
                    
                }else {
                    System.out.println(i + " ganjil negatif");
                }
            }    
        }   
    }
}