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
        int minimum = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        System.out.println(minimum);
    }
}
