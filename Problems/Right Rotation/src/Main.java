import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] arr = str.split(" ");
        int rotation = scan.nextInt();
        rotation = rotation % arr.length;

        for (int j = 1; j <= rotation; j++) {
            int i;
            String temp = arr[arr.length - 1];
            for (i = arr.length - 1; i >= 1; i--) {
                arr[i] = arr[i - 1];
            }
            arr[i] = temp;
        }

        Arrays.stream(arr).map(s -> s + " ").forEach(System.out::print);
    }
}
