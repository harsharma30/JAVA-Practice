// get a number is present its table if num is between 1 to 20 using while loop
import java.util.Scanner;
public class Table_while {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        if(num>=1 && num<=20){
            int i = 1;
            while(i<=10){
                System.out.println(num + " * " + i + " = " + (num*i));
                i++;
            }
        }
        else{
            System.out.println("Number entered is invalid");
        }
    }
}
