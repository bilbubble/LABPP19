import java.util.Scanner;

class LatihanLab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int x = a[i];
                int y = a[j];
                do {
                    int c = y;
                    y = x % y;
                    x = c;
                } while (y != 0);
                if (x == 1) {
                    System.out.printf("%d %d \n", a[i], a[j]);
                }
            }
        }
    }
}