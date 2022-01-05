package Array;

import java.util.Arrays;
import java.util.Scanner;

public class stringoperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] arr = new String[size];
        int count =0;
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.next();
            count = count + arr[i].length();
        }
        System.out.println(Arrays.asList(arr));
        System.out.println(count);
    }
}


