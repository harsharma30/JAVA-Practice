/*
 * Play with Num
 * Probliem: you are required to create a menu based application which ask user to input the choice 
 *           of menu option and execute only the required action
 * Menu option are:
 * 1. Count number of digits of input number
 * 2. Reverse the digit of an integer
 * 3. Check if input number is palindrome or not 
 * 4. Check if  input number is Armstrong
 * 5. Sum of Digits of input number
 * 0. Exit
 * Enter your choice:
 * 
 */
import java.util.Scanner;
public class PlayWithNum2{
    int num;
    int choice;
    void getChoice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        System.out.println("=========================================");
        System.out.println("Menu option are:");
        System.out.println("1. Count number of digits of input number");
        System.out.println("2. Reverse the digit of an integer");
        System.out.println("3. Check if input number is palindrome or not");
        System.out.println("4. Check if  input number is Armstrong");
        System.out.println("5. Sum of Digits of input number");
        System.out.println("==========================================");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
    }
    int countDigits(int num){
        int count = 0;
        int temp = num;
        while(temp>0){
            count++;
            temp = temp/10;
        }
        return count;
    }

    int reverseNum(int num){
        int ans = 0;
        int temp = num;
        while(temp>0){
            ans = ans*10 +temp%10;
            temp = temp/10;
        }
        return ans;
    }

    void checkPalindrome(int num){
        if(num == reverseNum(num)){
            System.out.println("Yes it is a palindrome");
        }
        else{
            System.out.println("No it is not a palindrome");
        }
    }

    void checkArmstrong(int num){
        int temp = num;
        int n = 0;
        while(temp>0){
            n+=Math.pow(temp%10,3);
            temp=temp/10;
        }
        if(num == n){
            System.out.println("Given num is an armstrong number");
        }
        else{
            System.out.println("Given num is not an armstrong number");
        }
    }

    int sumOfDigits(int num){
        int temp = num;
        int sum = 0;
        while(temp>0){
            sum+=temp%10;
            temp = temp/10;
        }
        return sum;
    }

    public static void main(String[] args){
        PlayWithNum2 run = new PlayWithNum2();
        run.getChoice();

        int num = run.num;
        int choice = run.choice;
        switch(choice){
            case 1:
            System.out.println("The total number of digits are: " + run.countDigits(num));
            break;

            case 2:
            System.out.println("The reverse of number is: " + run.reverseNum(num));
            break;

            case 3:
            run.checkPalindrome(num);
            break;

            case 4:
            run.checkArmstrong(num);
            break;

            case 5: 
            System.out.println("The sum of digits is: " + run.sumOfDigits(num));
            break;

            default:
            System.out.println("Choosen option is not available..");
            run.getChoice();
        }
    }
}