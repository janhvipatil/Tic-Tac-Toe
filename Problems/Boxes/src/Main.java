import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int[] arr1 = new int[3];
        for(int i = 0; i < 3; i++)
        {
            arr1[i] = scan.nextInt();
        }
        int[] arr2 = new int[3];
        for(int i = 0; i < 3; i++)
        {
            arr2[i] = scan.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int box1IsSmaller = 0;
        int box2IsSmaller = 0;

        for (int i = 0; i < 3; i++) {
            if (arr1[i] < arr2[i]) {
                box1IsSmaller++;
            } else if (arr1[i] > arr2[i]) {
                box2IsSmaller++;
            }
        }

        System.out.println(box1IsSmaller == 3 ? "Box 1 < Box 2" : box2IsSmaller == 3 ? "Box 1 > Box 2" : "Incompatible");
    }
}
