import java.util.Scanner;

class TugasLab4{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        nilai(a, b);
    }
    public static void nilai(int a, int b) {
        System.out.println(min(a , b));
        System.out.println(max(a, b));
        System.out.printf( "%.1f", bagi(a,b));
    }
    public static int min(int a, int b) {
        System.out.println("untuk min");
        int min = 0;
       if (a < b) {
           min = a;
       } else{
           min = b;
       }
       return min;
    }
    public static int max(int a, int b) {
        System.out.println("untuk max");
        int max = 0;
        if (a > b) {
            max = a;
        } else{
            max = b;
        }
        return max;
    }
    public static double bagi(double a, double b){
        System.out.println("pembagian : ");
        double c = a / b;
        return c;
    }
}