import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);

        char[][] arr = new char[4][4];

        String pretty = "YES";

        for (int i = 0; i < 4; i++) {
            String str = scan.next();
            for (int j = 0; j < 4; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        loop:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == (arr[i][j + 1]) &&
                        arr[i][j] == (arr[i + 1][j]) &&
                        arr[i][j] == (arr[i + 1][j + 1])) {
                    pretty = "NO";
                    break loop;
                }
            }
        }
        System.out.println(pretty);
    }
}
