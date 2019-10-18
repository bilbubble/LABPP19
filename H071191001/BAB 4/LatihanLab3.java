import java.util.Scanner;

class LatihanLab3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int [] arr = new int [total];
        int totalArr = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            totalArr += arr[i];
        }

        int total2 = sc.nextInt();
        int [] arr2 = new int [total2];
        int totalArr2 = 0;

        for (int j = 0; j < arr2.length; j++) {
            arr2 [j] = sc.nextInt();
            totalArr2 += arr2[j];
        }
        int sum = totalArr + totalArr2;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    sum -= arr2[j];
                }
            }
        }

        System.out.println(sum);

    }
}