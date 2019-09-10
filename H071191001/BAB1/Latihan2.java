import java.util.Scanner;

public class Latihan2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int tb = sc.nextInt();
        int bb = sc.nextInt();
        int m = sc.nextInt();

        double ideal = (double) (tb-100)-(tb-100)*10/100.0;
        double target = (ideal-bb);

        System.out.println("nama :" + name);
        System.out.println("tinggi badan :" + tb);
        System.out.println("berat badan :" + bb);
        System.out.printf("ideal berat badan %.2f :", ideal);
        System.out.printf("target %.2f :", target);
    }
}