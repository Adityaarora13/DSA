package Array;

import java.util.Scanner;

public class stringoperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i)-48);
            sum=sum + (s.charAt(i)-48);
        }
        System.out.println("sum = "+sum);
    }
}



