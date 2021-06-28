import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][]matrix = new int [7777][7777];
        int counter = 0;
        int counter1 = 0;
        for (int i = 0; i < 7777; i++) {
            String s = scanner.nextLine();
            if (!"end".equals(s)) {
                counter++;
                String[] s1 = s.split(" ");
                for (int j = 0; j < s1.length; j++) {
                    matrix[i][j] = Integer.parseInt(s1[j]);
                    counter1++;
                }
            } else {
                break;
            }
        }
        int v = counter;
        int h = counter1/counter;

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < h; j++) {
                if (v == 1 || h == 1) {
                    System.out.print(matrix[i][j]*4 + " ");
                } else if (i == 0){
                    if (j == 0){
                        System.out.print(matrix[v-1][j] + matrix[i+1][j] + matrix[i][h-1] + matrix[i][j+1] + " ");
                    } else if (j != h-1){
                        System.out.print(matrix[v-1][j] + matrix[i+1][j] + matrix[i][j-1] + matrix[i][j+1] + " ");
                    } else {
                        System.out.print(matrix[v-1][j] + matrix[i+1][j] + matrix[i][j-1] + matrix[i][0] + " ");
                    }
                } else if (j == 0 && i != v-1){
                    System.out.print(matrix[i-1][j] + matrix[i+1][j] + matrix[i][h-1] + matrix[i][j+1] + " ");
                } else if (j != 0 && j != h-1 && i != v-1) {
                    System.out.print(matrix[i-1][j] + matrix[i+1][j] + matrix[i][j-1] + matrix[i][j+1] + " ");
                } else if (j == h-1 && i != v-1){
                    System.out.print(matrix[i-1][j] + matrix[i+1][j] + matrix[i][j-1] + matrix[i][0] + " ");
                } else if (i == v-1) {
                    if (j == 0) {
                        System.out.print(matrix[i-1][j] + matrix[0][j] + matrix[i][h-1] + matrix[i][j+1] + " ");
                    } else if (j != h-1) {
                        System.out.print(matrix[i-1][j] + matrix[0][j] + matrix[i][j-1] + matrix[i][j+1] + " ");
                    } else {
                        System.out.print(matrix[i-1][j] + matrix[0][j] + matrix[i][j-1] + matrix[i][0] + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}