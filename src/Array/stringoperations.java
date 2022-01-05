package Array;

import java.util.Arrays;
import java.util.Scanner;

public class stringoperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String x = sc.next();
        String y = sc.next();
        String result = "";
//        for(int i=0;i<s.length();i++)
//        {
//            if((String.valueOf(s.charAt(i)).equals(x)))
//            {
//                result = result+y;
//            }
//            else result= result + s.charAt(i);
//        }
//        System.out.println(result);
//    }
        // using replace function
        System.out.println(s.replace(x, y));
    }
}


