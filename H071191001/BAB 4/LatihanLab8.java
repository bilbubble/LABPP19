import java.util.Scanner;

class LatihanLab8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int m1[][] = new int [n][m];
        int m2[][] = new int [n][k];

        System.out.println("matriks A :");
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < m; b++) {
               m1 [a][b] = sc.nextInt();
               System.out.print(m1[a][b] + " ");
            }   
            System.out.println();
        }
        System.out.println("matriks B :");
        for (int b = 0; b < m; b++) {
            for (int c = 0; c < k; c++) {
               m2 [b][c] = sc.nextInt();
               System.out.print(m2[b][c] + " ");
            } 
            System.out.println();
        }

        System.out.println("matriks a x matriks b :");
        for (int a = 0; a < n; a++) {
            for (int c = 0; c < k; c++) {
                int hasil = 0;
                for (int b = 0; b < m; b++) {
                    hasil += m1[a][b] * m2[b][c];
                }
                System.out.print(hasil + " ");
            }System.out.println();
         }
    }
}