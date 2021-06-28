import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int i;
        int temp = arr[n - 1];
        for (i = n - 1; i >= 1; i--) {
            arr[i] = arr[i - 1];
        } arr[i] = temp;

        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
