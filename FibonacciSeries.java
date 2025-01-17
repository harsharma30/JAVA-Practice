// Fibonnaci Series
import java.util.Scanner;
class FibonacciSeries(){
    int getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        sc.nextInt();
    }
    void fibo(int num){
        int a = 0;
        int b = 1;
        int temp = 0;
        int i = 1;
        while(i<=num){
            System.out.print(a+" ");
            temp=a+b;
            a = b;
            b = temp;
            i++;
        }
    }
    public static void main(String[] args){
        FibonacciSeries H = new FibonacciSeries();
        int num = H.getData();
        H.fibo(num);

    }
}