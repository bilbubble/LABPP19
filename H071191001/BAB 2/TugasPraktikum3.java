import java.util.InputMismatchException;
import java.util.Scanner;

class TugasPraktikum3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try { 
            int positif = 0;
            int negatif = 0;
            int ganjil = 0;
            int genap = 0;
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();

            if (a==0){
                genap++;
            }else if (a%2==0 ) {
                  genap++;
                  if (a>0) {
                      positif++;
                  }else {
                      negatif++;
                  }
              }else {
                  ganjil++;
                  if (a>0) {
                    positif++;
                }else {
                    negatif++;
                }

              }if (b==0){
                genap++;
            }else if (b%2==0 ) {
                  genap++;
                  if (b>0) {
                      positif++;
                  }else {
                      negatif++;
                  }
              }else {
                  ganjil++;
                  if (b>0) {
                    positif++;
                }else {
                    negatif++;
                }
              }

              if (c==0){
                genap++;
            } else if (c%2==0 ) {
                  genap++;
                  if (c>0) {
                      positif++;
                  }else {
                      negatif++;
                  }
              }else {
                  ganjil++;
                  if (c>0) {
                    positif++;
                } else {
                    negatif++;
                }
              }

              if (d==0){
                genap++;
            } else if (d%2==0 ) {
                  genap++;
                  if (d>0) {
                      positif++;
                  }else {
                      negatif++;
                  }
              }else {
                  ganjil++;
                  if (d>0) {
                    positif++;
                }else {
                    negatif++;
                }
              }

              if (e==0){
                genap++;
            } else if (e%2==0 ) {
                  genap++;
                  if (e>0) {
                      positif++;
                  }else {
                      negatif++;
                  }
              }else {
                  ganjil++;
                  if (e>0) {
                    positif++;
                }else {
                    negatif++;
                }
              }
            System.out.println("Angka genap " + genap);
            System.out.println("Angka ganjil " + ganjil);
            System.out.println("Angka positif " + positif);
            System.out.println("bilangan negatif " + negatif);  
        } catch (InputMismatchException e) {
            System.out.println("inputan tidak valid");
        }
    }
}