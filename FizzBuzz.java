// write a pro
import java.util.Scanner; 
public class FizzBuzz{
    int n;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
    }
    void printNum(){
        if(n>=20 && num<=20){
            for(int i=1;i<=n;i++){
                
                if(i%3==0 && i%5==0){
                    System.out.print(" FizzBuzz ");
                }
                else if(i%3==0){
                    System.out.print(" Fizz ");
                }
                else if(i%5==0){
                    System.out.print(" Buzz ");
                }
                else{
                    System.out.print(" "+i+" ");
                }
                
            }
        }
    }
    public static void main(String[] args){
        FizzBuzz H = new FizzBuzz();
        H.getData();
        H.printNum();
    }
    
}