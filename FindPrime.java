// get a number and find if it is a prime number or not 
import java.util.Scanner;
public class FindPrime{
    int num;
    void getNum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        num = sc.nextInt();
    }
    void isPrime(){
        if (num>0){
            for(int i = 2; i<=num/2; i++){
                if(num%i==0){
                    System.out.println("No its not a Prime number");
                }
                else{
                    System.out.println("Yes its a Prime number");
                }
            }
        }
        else{
            System.err.println("Number entered is out of the bound..");
        }
    }
    public static void main(String[] args){
        FindPrime H = new FindPrime();
        H.getNum();
        System.out.println(H.isPrime());
    }
}