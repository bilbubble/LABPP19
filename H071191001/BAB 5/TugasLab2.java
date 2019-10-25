import java.util.Scanner;
import java.util.Random;
class TugasLab2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random a = new Random();
        int n = sc.nextInt();
        int m = sc.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);
    }

    public static String generateSerial(int n, int m) {
        Random rd = new Random();
        String str = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m ; j++) {
                str += (rd.nextInt(9));
            }
            if (i != (n -1)) {
                str += " - ";
            }
        }
        return str;
    }
}