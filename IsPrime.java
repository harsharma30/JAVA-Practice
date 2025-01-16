//get two numbers and find prime number between them
import java.util.Scanner;
public class IsPrime{
    int num1;
    int num2;
    void getNum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
    }
    boolean ifPrime(int num){

        if(num<=1){
            return false;
        }

            for(int i = 2; i<=num/2; i++){
                if(num%i==0){
                    return false;
                }
            }
            return true;
    }
    void isPrime(){    
    int count=0;
        for(int i=num1;i<=num2;i++){
                if(ifPrime(i)){
                    count++;
                    System.out.print(i+" ");
                }
            }
            System.out.println(count);
    }
    public static void main(String[] args){
        IsPrime H = new IsPrime();
        H.getNum();
        System.out.println(H.isPrime());
    }
}
