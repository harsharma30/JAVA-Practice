import java.util.Scanner;
public class InsuranceCalcW{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age;
        char gender;
        System.out.println("Enter the age: ");
        age = sc.nextInt();
        System.out.println("Enter the Gender(M/F): ");
        gender = sc.next().charAt(0);


        if(age>0 && age<15){
            System.out.println("---------------------------------------------------------------");
            System.out.println("30% Discount is applicable on 2500 rupees");
            System.out.println("Net payable amount:"+ (2500-(0.3*2500)));
            if(gender=='F'){
                System.out.println("Extra 5% discount, Now net payable is: "+ (2500-(0.35*2500)));
            }
            System.out.println("---------------------------------------------------------------");
        }
        else if(age>16 && age<25){
            System.out.println("---------------------------------------------------------------");
            System.out.println("20% Discount is applicable on 3500 rupees");
            System.out.println("Net payable amount:"+ (3500-(0.2*3500)));
            if(gender=='F'){
                System.out.println("Extra 5% discount, Now net payable is: "+ (3500-(0.25*3500)));
            }
            System.out.println("---------------------------------------------------------------");
        }
        else if(age>26 && age<40){
            System.out.println("---------------------------------------------------------------");
            System.out.println("15% Discount is applicable on 4000 rupees");
            System.out.println("Net payable amount:"+ (4000-(0.15*4000)));
            if(gender=='F'){
                System.out.println("Extra 5% discount, Now net payable is: "+ (4000-(0.20*4000)));
            }
            System.out.println("---------------------------------------------------------------");
        }
        else if(age>41 && age<50){
            System.out.println("---------------------------------------------------------------");
            System.out.println("10% Discount is applicable on 4500 rupees");
            System.out.println("Net payable amount:"+ (4500-(0.1*4500)));
            if(gender=='F'){
                System.out.println("Extra 5% discount, Now net payable is: "+ (4500-(0.15*4500)));
            }
            System.out.println("---------------------------------------------------------------");
        }
        else if(age>51 && age<70){
            System.out.println("---------------------------------------------------------------");
            System.out.println("No discount and amount is 5500");
            System.out.println("Net payable amount: 5500");
            System.out.println("---------------------------------------------------------------");
        }
        else{
            System.out.println("---------------------------------------------------------------");
            System.err.println("No insurance eligibilty becuase age is greater than 70");
            System.out.println("---------------------------------------------------------------");
        }

    }
}