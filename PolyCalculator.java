/*You are required to devlop a Calculator for a basic math application. The calculator should be capable 
of performing addition, multiplication, and finding the square of a number. These operation might involve:
Addtion of two or three or more number
Multiplication of two or three number
Finding Square of a number


Class: Calculator
public int addition(int num1, int num2)
public int addition(int num1, int num2)
public int addition(int num)
public int multiplication(int num1, int num2)
public int multiplication(int num1, int num2,int num3)
public int sqaure(int num1)

main()
call all above defined method

*/
import java.util.Scanner;
public class PolyCalculator{
    // int getData(){
    //     Scanner sc = new Scanner(System.in);
    //     return sc.nextInt();
    // }
    public int addition(int num1, int num2){
        return num1 + num2;
    }
    public int addition(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    public int addition(int num){
        // int arr = {1,2,3,4,5};
        int arr[]=new int[num];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
            System.out.println("Enter the vaalue "+(i+1)+":");
            arr[i]=sc.nextInt();
        }
        for(int i = 0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        return sum;
    }
    public int multiplication(int num1, int num2){
        return num1 * num2;
    }
    public int multiplication(int num1, int num2,int num3){
        return num1 * num2 * num3;
    }
    public int sqaure(int num){
        return square = num * num;
    }

    public static void main(String[] args){
        
    }
}