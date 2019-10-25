import java.util.Scanner;

class TugasLab5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(mutlak(n));
    }
    public static int mutlak(int n) {
        System.out.print("absolute = ");
        return n < 0 ? -1 * n : n;
    }
}