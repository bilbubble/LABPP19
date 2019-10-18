import java.util.Scanner;

class LatihanLab6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int barisKolom = sc.nextInt();
        int [][] matriks = new int[barisKolom][barisKolom];

        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks.length; j++) {
                matriks[i][j] = sc.nextInt(); 
                
            }
        }
        for (int i = 1; i < barisKolom - 1; i++) {
            for (int j = 1; j < barisKolom - 1; j++) {
                if(matriks[i][j] == 0 && matriks[i][j] != matriks[i - 1][j] && matriks[i][j] != matriks [i + 1][j]){
                    if (matriks[i][j] != matriks[i][j - 1] && matriks[i][j] != matriks[i][j + 1]) {
                    }
                    System.out.println(i + "," + j);
                }
            }
        }
    }
}