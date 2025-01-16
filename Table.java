// get a number is present its table if num is between 1 to 20 
import java.util.Scanner;
public class Table{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        if(num>=1 && num<=20){
            for(int i=0;i<=10;i++){
                System.out.println(num + " * " + i + " = " + (num*i));
            }
        }
        else{
            System.out.println("Number entered is invalid");
        }
    }
}