package Array;

import java.util.Scanner;

public class stringalter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String username="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='@')
                break;
            else username = username + s;

        }
        System.out.println(username);
    }
}
