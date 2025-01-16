/*
 * Make a calculator including two number num1 and num2 which is get compared on the basis of < and >...
 * 
 * Class: RelationalCalculator
 * Properties: num1, num2, optr
 * Methods: getData(), greaterThan(), lesserThan()
 * Main Method
 */
import java.util.Scanner;
public class RelationalCalculator{
    int num1;
    int num2;
    char optr;

    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("Enter first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        num2 = sc.nextInt();
        System.out.println("Enter any operator > or < : ");
        optr = sc.next().charAt(0);
    }

    String greaterThan(){
        String msg="";
        if(num1>num2){
            msg = num1 + " is greater than " + num2;
        }
        else if(num2 > num1){
            msg = num2 + " is greater than "+ num1;
        }
        else{
            msg = "Both " + num1 +" and " + num2 + " are equal.";
        }
        return msg;
    }

    String lesserThan(){
        String msg="";
        if(num1 < num2){
            msg = num1 + " is lesser than " + num2;
        }
        else if(num2 < num1){
            msg = num2 + " is lesser than "+ num1;
        }
        else{
            msg = "Both " + num1 +" and " + num2 + " are equal.";
        }
        return msg;
    }
    public static void main(String[] args){
        //make object of RelationalCalculator
        RelationalCalculator calc = new RelationalCalculator();  //used in calling the methods present in the class

        // call all instance method
        calc.getData();

        switch(calc.optr){
            case '>':
            System.out.println(calc.greaterThan());
            
            break;

            case'<':
            System.out.println(calc.lesserThan());
            break;

            default:
            System.err.println("only > or < allowed...");
        }
        System.out.println("-----------------------------------------------");
    }
}