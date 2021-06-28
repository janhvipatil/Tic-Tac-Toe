import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int value1 = scan.nextInt();
        int value2 = scan.nextInt();
        boolean conditionIsMet = true;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == value1 && arr[i + 1] == value2 || arr[i] == value2 && arr[i + 1] == value1) {
                conditionIsMet = false;
            }
        }

        System.out.println(conditionIsMet);
    }
}
