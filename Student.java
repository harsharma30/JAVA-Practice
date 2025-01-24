/*To input roll no, name and marks in five subjects and calculate the total and average marks. Define different 
functions to input, calculate and display the data.

class : Student

Properties:
private int rollno'
private String name;
private double marks[] =new double[5]

Method:
public void inputData(); 
private double findTotal();
private double findAverage();
public void showData();

*/
import java.util.Scanner;
public class Student {
    private int rollno;
    private String name;
    private double marks[] =new double[5];

    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.print("Enter roll number: ");
        rollno = sc.nextInt();
        System.out.print("Enter name: ");
        name = sc.next();
        for(int i = 0;i<marks.length;i++){
            System.out.println("Enter marks for subject "+(i+1)+ " :");
            marks[i] = sc.nextDouble();
        }
        System.out.println("=======================================================");
    } 
    private double findTotal(){
        double total = 0.0;
        for(int i = 0;i<marks.length;i++){
            total = total + marks[i];
        }
        return total;
    }
    private double findAverage(){
        return findTotal()/5;
    }
    public void showData(){
        System.out.println("Roll number: "+ rollno);
        System.out.println("Name: " + name);
        for(int i = 0;i<marks.length;i++){
            System.out.println("Marks for subjects: "+ marks[i]);
        }

        System.out.println("Total marks: "+ findTotal());
        System.out.println("Average marks: "+ findAverage());
    }
    public static void main(String[] args){
        Student run = new Student();
        run.inputData();
        run.showData();

    }

}
