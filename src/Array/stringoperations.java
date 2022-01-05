package Array;

import java.util.Scanner;

public class stringoperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if (s1.compareTo(s2) == 0)
            System.out.println("strings are equal");
        else
            System.out.println("strings are not equal");
    }
}


