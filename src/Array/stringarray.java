package Array;

import java.util.Scanner;

public class stringarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        for(int i=0;i<array.length;i++)
        {
            array[i] = sc.next();
        }
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}
