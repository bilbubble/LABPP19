import java.util.Scanner;

class TugasLab1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        fpb(a, b);
    }
    public static void fpb(int a, int b) {
        System.out.println(jumlah(a , b));
    }
    public static double jumlah(int a, int b) {
        System.out.printf("FPB dari %d dan %d = ", a, b);
        int c = a % b;
        do {
            a = b;
            b = c;
            c = a % b; 
        } while (c != 0);
        return b;
    }
}