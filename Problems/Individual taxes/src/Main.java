import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int companies = scan.nextInt();
        int[] incomeArray = new int[companies];
        double[] taxPercentArray = new double[companies];
        double[] taxArray = new double[companies];

        for (int i = 0; i < companies; i++) {
            incomeArray[i] = scan.nextInt();
        }

        for (int i = 0; i < companies; i++) {
            taxPercentArray[i] = scan.nextInt();
        }

        double max = 0;
        for (int i = 0; i < companies; i++) {
            taxArray[i] = incomeArray[i] * (taxPercentArray[i] / 100);
            if (taxArray[i] > max) {
                max = taxArray[i];
            }
        }

        int maxIndex = 0;
        for (int i = 0; i < companies; i++) {
            if (taxArray[i] == max) {
                maxIndex = i;
            }
        }
        System.out.println(maxIndex + 1);
    }
}
