import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int tempI = 0;
        int tempJ = 0;

        int[][] arr = new int[n][m];
        long max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    tempI = i;
                    tempJ = j;
                }
            }
        }
        System.out.printf("%d %d", tempI, tempJ);
    }
}