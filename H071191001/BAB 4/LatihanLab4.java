import java.util.Scanner;

class LatihanLab4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array [] = new int [n];
        int number = 0;
        int sama = 0;
        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++){
            for ( int j = 0; j < array.length; j++){
                if ( array[i] == array[j]){
                    number++;
                    sama = array[i];
                }
            }
        }
        if ( number == n){
            System.out.println("Tidak ada yang sama");
        } else {
            System.out.println("Ada yang sama");
        }
    }
}