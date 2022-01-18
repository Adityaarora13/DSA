import java.util.Scanner;
import java.util.Arrays;
class A{
    int x;
    int y;
    A(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    A(){}
}
class main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        A[] arr = new A[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = new A(sc.nextInt(),sc.nextInt());
        }
        A obj = new A();
        for (int i = 0; i < 5; i++) {
            obj.x=obj.x+arr[i].x;
            obj.y=obj.y+arr[i].y;
        }
        System.out.println(obj.x + "  " +obj.y);

    }
}