import java.util.Scanner;

public class Latihan3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean tes = a%b==0;

        System.out.println("apakah " + a + " kelipatan dari " +  b  + "? " + tes );
    }
}