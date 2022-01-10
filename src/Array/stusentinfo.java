package Array;

import java.util.Arrays;
import java.util.Scanner;
class Student{
    private int rollno;
    private int marks;
    private String name;

    public Student(int rollno, int marks, String name) {
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class stusentinfo {
    public static void main(String[] args) {
        Student students[] = new Student[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<10; i++) {
//            taking student data
            int rollno = sc.nextInt();
            int marks = sc.nextInt();
            String name = sc.next();
            students[i] = new Student(rollno, marks, name);
        }
        int max=students[0].getMarks();
        int min=students[0].getMarks();
        for (int i = 1; i <10 ; i++) {
            int n = students[i].getMarks();
            if(max<n){
                max=n;
            }
            if(min>n){
                min=n;
            }
        }
        System.out.println("highest marks : "+max+"  "+" Lowest Marks : "+min);

    }
}
