//print prime number upto n 
import java.util.Scanner;
public class PrimeInRange{
    int n;
    void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n= sc.nextInt();
    }
    boolean isPrime(int num){
        if(num<=1){
            return false;
        }
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    return false;
                }
            }
        return true;
    }
    public static void main(String[] args){
        PrimeInRange H = new PrimeInRange();
        H.getInput();
        int i = 0;
        while(i<=H.n){
            if(H.isPrime(i)){
                System.out.print(i+" ");
            }
            i++;

        }
       
    }
}