package Array;

import java.util.Scanner;

public class array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc. nextInt();
        int marks[] = new int[size];
        int x = sc.nextInt();
        for(int i=0;i<marks.length;i++)
        {
            marks[i] = sc.nextInt();
        }
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]==x)
            System.out.println(i);
        }
    }
}
