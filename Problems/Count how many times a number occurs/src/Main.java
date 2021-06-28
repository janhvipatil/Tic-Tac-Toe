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

        int value = scan.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == value) {
                count++;
            }
        }

        System.out.println(count);
    }
}
