import java.util.Scanner;

class TugasPraktikum4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int menu = sc.nextInt();

         switch (menu) {
             case 1:
             System.out.printf("pilih bangun datar \n1. Persegi\n2. Persegi Panjang\n3. Segitiga\n4. Lingkaran\n5. Jajar Genjang\n6. Trapesium\n7. Belah Ketupat\n8. Layang - Layang"); 
             System.out.println();            
             System.out.println("Input sesuai dengan nomor bangun datar yang diinginkan");   
             int angka = sc.nextInt();
             
             switch (angka) {
                 case 1:
                 System.out.println("masukkan sisi :");
                 double s = sc.nextDouble();
                 double hasil1 = (s * s);
                 System.out.println("luas persegi = " + hasil1);
                 break;

                 case 2:
                 System.out.println("masukkan panjang :");
                 double p = sc.nextDouble();
                 System.out.println("masukkan lebar :");
                 double l = sc.nextDouble();
                 double hasil2 = (p * l);
                 System.out.println("luas persegi = " + hasil2);
                 break;

                 case 3:
                 System.out.println("masukkan alas :");
                 double a = sc.nextDouble();
                 System.out.println("masukkan tinggi :");
                 double t = sc.nextDouble();
                 double hasil3 = ((a * t)/2);
                 System.out.println("luas segitiga = " + hasil3);
                 break;

                 case 4:
                 System.out.println("masukkan jari - jari :");
                 double r = sc.nextDouble();
                 double phi = 3.14;
                 double hasil4 = (phi * r * r);
                 System.out.println("luas lingkaran = " + hasil4);
                 break;

                 case 5:
                 System.out.println("masukkan alas :");
                 double alas = sc.nextDouble();
                 System.out.println("masukkan tinggi :");
                 double tinggi = sc.nextDouble();
                 double hasil5 = (alas * tinggi);
                 System.out.println("luas jajar genjang = " + hasil5);
                 break;

                 case 6:
                 System.out.println("masukkan sisi 1 :");
                 double s1 = sc.nextDouble();
                 System.out.println("masukkan sisi 2 :");
                 double s2 = sc.nextDouble();
                 System.out.println("masukkan tinggi :");
                 double h = sc.nextDouble();
                 double hasil6 = (((s1 + s2) * h) / 2);
                 System.out.println("luas trapesium = " + hasil6);
                 break;

                 case 7:
                 System.out.println("masukkan diameter 1 :");
                 double d1 = sc.nextDouble();
                 System.out.println("masukkan diameter 2 :");
                 double d2 = sc.nextDouble();
                 double hasil7 = ((d1 * d2) / 2);
                 System.out.println("luas belah ketupat = " + hasil7);
                 break;

                 case 8:
                 System.out.println("masukkan diameter 1 :");
                 double dia1 = sc.nextDouble();
                 System.out.println("masukkan diameter 2 :");
                 double dia2 = sc.nextDouble();
                 double hasil8 = ((dia1 * dia2) / 2);
                 System.out.println("luas layang - layang = " + hasil8);
                 break;

                 default:
                 System.out.println("data tidak terbaca");
                 break;
             }      
         }
    }
}