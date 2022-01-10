package Array;

import java.util.Scanner;

public class jan9q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[][] = new int[5][3];
        int ts = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the sales of 3 items by salesman " + (i+1)+" : ");
            for (int j = 0; j < 3; j++) {
                arr[i][j] = s.nextInt();
            }

        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                ts += arr[i][j];
            }
            System.out.println("Total sale by salesman " + (i+1) + " = " + ts);
            ts = 0;

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                ts += arr[j][i];
            }
            System.out.println("Total sale of item " + (i+1) + " = " + ts);
            ts = 0;
        }
    }
}
