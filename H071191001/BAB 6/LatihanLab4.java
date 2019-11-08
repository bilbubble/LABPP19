import java.util.Scanner;

class LatihanLab4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kata = sc.next();
    
        if (kata.length()% 2 == 0){
            System.out.println("genap");
            return;
        } else{
            System.out.println("ganjil");
        }
        //perulangan untuk membentuk baris.
        for (int i = 0; i < (kata.length() / 2) + 2; i++) {
            // bentuk segitiga spasi
            for (int j = i; j < kata.length(); j++) {
                System.out.print(" ");
            }
            //membentuk segitiga untuk karakter
            for (int k = 0; k <=  (i * 2) - 2; k++) {
                System.out.print(kata.charAt(k));
            }
            System.out.println();
        }

            
        
    }
}