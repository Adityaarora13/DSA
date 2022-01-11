package Array;

import java.util.Arrays;
import java.util.Scanner;

public class jan11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size+1];
        for (int i = 0; i < size; i++)
        {
            arr[i] = s.nextInt();
        }
        for (int i = 1; i <= size; i++) {
            if (arr[i-1] != arr[i])
                System.out.println(arr[i-1]);
            else continue;
        }
    }
}
