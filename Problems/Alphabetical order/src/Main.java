import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] arr = str.split(" ");
        int isSorted = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) <= 0) {
                isSorted++;
            }
        }
        System.out.println(isSorted == arr.length - 1);
    }
}
