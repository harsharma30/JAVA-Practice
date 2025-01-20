import java.util.Scanner;
public class ShortName {
    String firstName;
    String lastName;
    String surName;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        firstName=sc.nextLine();
        System.out.print("Enter the last name: ");
        lastName=sc.nextLine();
        System.out.print("Enter the surname name: ");
        surName=sc.nextLine();
    }
    void printName(String firstName, String lastName, String surName){
        char ch1 = firstName.toUpperCase().charAt(0);
        char ch2 = lastName.toUpperCase().charAt(0);

        System.out.println(ch1+". "+ch2+". "+surName);
    }
    public static void main(String[] args){
        ShortName run = new ShortName();
        run.getData();
        run.printName(run.firstName, run.lastName, run.surName);
    }
}
