import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int maxProduct = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int product = arr[i] * arr[i + 1];
            if (product > maxProduct) {
                maxProduct = product;
            }
        }
        System.out.println(maxProduct);
    }
}
