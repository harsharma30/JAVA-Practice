import java.util.Scanner;
public class InsuranceCalc1{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter the age: ");
        age = sc.nextInt();
        if(age>0 && age<15){
            System.out.println("30% Discount is applicable on 2500 rupees");
            System.out.println("Net payable amount:"+ (2500-(0.3*2500)));
        }
        else if(age>16 && age<25){
            System.out.println("20% Discount is applicable on 3500 rupees");
            System.out.println("Net payable amount:"+ (3500-(0.2*3500)));
        }
        else if(age>26 && age<40){
            System.out.println("15% Discount is applicable on 4000 rupees");
            System.out.println("Net payable amount:"+ (4000-(0.15*4000)));
        }
        else if(age>41 && age<50){
            System.out.println("10% Discount is applicable on 4500 rupees");
            System.out.println("Net payable amount:"+ (4500-(0.1*4500)));
        }
        else if(age>51 && age<70){
            System.out.println("No discount and amount is 5500");
            System.out.println("Net payable amount: 5500");
        }
        else{
            System.err.println("No insurance eligibilty becuase age is greater than 70");
        }

    }
}