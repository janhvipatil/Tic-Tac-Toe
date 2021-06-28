package tictactoe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Create a blank tic-tac-toe Matrix
        char[][] arr = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = '_';
            }
        }

        // Print tic-tac-toe Matrix
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------\n");

        int blank;

        boolean xWon = false;
        boolean oWon = false;

        // Prompt user to make a move
        do {

            blank = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (arr[i][j] == '_') {
                        blank++;
                    }
                }
            }

            for (int k = 0; k < 3 ; k++) {
                //vertical checking for X
                if (arr[0][k] == 'X' && arr[1][k] == 'X' && arr[2][k] == 'X') {
                    xWon = true;
                }
                //vertical checking for O
                if (arr[0][k] == 'O' && arr[1][k] == 'O' && arr[2][k] == 'O') {
                    oWon = true;
                }
                //horizontal checking for X
                if(arr[k][0] == 'X' && arr[k][1] == 'X' && arr[k][2] == 'X') {
                    xWon = true;
                }
                //horizontal checking for O
                if(arr[k][0] == 'O' && arr[k][1] == 'O' && arr[k][2] == 'O') {
                    xWon = true;
                }
                //diagonal checking for X
                if (arr[0][0] == 'X' && arr[1][1] == 'X' && arr[2][2] == 'X'
                        || arr[0][2] == 'X' && arr[1][1] == 'X' && arr[2][0] == 'X') {
                    xWon = true;
                }
                //diagonal checking for O
                if (arr[0][0] == 'O' && arr[1][1] == 'O' && arr[2][2] == 'O'
                        || arr[0][2] == 'O' && arr[1][1] == 'O' && arr[2][0] == 'O') {
                    oWon = true;
                }
            }

            //game over
            if(xWon) {
                System.out.println("X wins");
                break;
            }
            if (oWon) {
                System.out.println("O wins");
                break;
            }

            System.out.println("Enter the coordinates:");
            String x = scan.next();
            String y = scan.next();
            int i1 = Integer.parseInt(x);
            int j1 = Integer.parseInt(y);

            if (i1 < 1 || i1 > 3 || j1 < 1 || j1 > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
            } else if (arr[i1 - 1][j1 - 1] != '_') {
                System.out.println("This cell is occupied! Choose another one!");
            } else
                // Play your move
                if (arr[i1 - 1][j1 - 1] == '_') {
                    arr[i1 - 1][j1 - 1] = 'X';

                    // Print new tic-tac-toe Matrix
                    System.out.println("---------");
                    for (int i = 0; i < 3; i++) {
                        System.out.print("| ");
                        for (int j = 0; j < 3; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println("|");
                    }
                    System.out.println("---------\n");
                }
        } while (blank > 0);
    }
}
