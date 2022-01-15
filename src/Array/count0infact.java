package Array;

import java.util.Scanner;

public class count0infact {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int fact=1,count=0;
        for (int i = n; i >0 ; i--) {
            fact = fact*i;
        }
        System.out.println(fact);
        String str =Integer.toString(fact);
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '0') {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
