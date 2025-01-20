// to print numbers between two numbers.
// using different loop
import java.util.Scanner;
public class BetweenTwoNum{
    int num1;
    int num2;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
    }
    void giveData(){
        if(num1<num2){
            while(num1<=num2){
                System.out.print(num1+ " ");
                num1++;
            }
        }
        else{
            while(num2<=num1){
                System.out.print(num2+" ");
                num2++;
            }
        }
    }
    public static void main(String[] args){
        BetweenTwoNum H = new BetweenTwoNum();
        H.getData();
        H.giveData();
    }
}