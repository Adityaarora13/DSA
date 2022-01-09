package Array;

import java.util.Scanner;

public class jan9q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter rows = ");
        int m=s.nextInt();
        System.out.println("Enter columns = ");
        int n=s.nextInt();
        System.out.println("Enter elements of array : ");
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter 1 for average marks obtained in each subject ");
        System.out.println("Enter 2 for average marks obtained by every student ");
        System.out.println("Enter 3 for student who scored below 50 in average ");
        System.out.println("Enter 4 to display scores obtained by every student ");
        int x = s.nextInt();
        if (x == 1) {
            int avgsum = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    avgsum += arr[j][i];
                }
                System.out.println("average marks obtained in each subject = " + avgsum / m);
                avgsum = 0;
            }
        } else if (x == 2) {
            int avgsum = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    avgsum += arr[i][j];
                }
                System.out.println("average marks obtained by every student = " + avgsum / n);
                avgsum = 0;
            }
        } else if (x == 3) {
            int count = 0, avgsum = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    avgsum += arr[i][j];
                    if (avgsum < 50)
                        count += count;
                }
                avgsum = 0;
            }
            System.out.println("students who scored below 50 in average = " + count);
        } else if (x == 4) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    sum += arr[j][i];
                }
                System.out.println("scores obtained by every student = " + sum / 500);
                sum = 0;
            }
        } else
            System.out.println("wrong choice");

    }
}