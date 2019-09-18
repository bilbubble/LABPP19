import java.util.Scanner;

class TugasPraktikum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x < 0 && y > 0) {
            if (x + y <0) {
                System.out.printf("Titik (%d,%d) terletak pada kuadran 1", x, y);
            }else if (x + y >0) {
                System.out.printf("Titik (%d,%d) terletak pada kuadran 2", x, y);
            }else{
                System.out.println("terletak garis -x = y");
            }
            
        }if (x > 0 && y > 0) {
            if (x - y < 0) {
                System.out.printf("Titik (%d,%d) terletak pada kuadran 3", x, y);
            }else if (x - y > 0){
                System.out.printf("Titik (%d,%d) terletak pada kuadran 4", x, y);
            }else{
                System.out.println("terletak garis x = y");
            }

        }if (x > 0 && y < 0) {
            if (x + y > 0) {
                System.out.printf("Titik (%d,%d) terletak pada kuadran 5", x, y);
            }else if (x + y < 0){
                System.out.printf("Titik (%d,%d) terletak pada kuadran 6", x, y);
            }else{
                System.out.println("terletak garis x = -y");
            } 
            
        }if (x < 0 && y < 0) {
            if (x - y < 0) {
                System.out.printf("Titik (%d,%d) terletak pada kuadran 7", x, y);
            }else if (x - y > 0) {
                System.out.printf("Titik (%d,%d) terletak pada kuadran 8", x, y);
            }else{
                System.out.println("terletak garis -x = -y");
            }
        }else {
            System.out.println("terletak di pusat (0,0)");
        } 
    }
}