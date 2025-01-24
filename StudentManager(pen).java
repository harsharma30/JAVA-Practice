/*while extending the functionality of Student.java, our  application should work for N number of student 
    for following menu: 
    * Student Manager
    1. Add New Student Data
    2. Show All student Data
    3. Show Student Data by Roll Number
    4. Show Student Data by Name
    5. Exit from Menu
    
class : StudentManager

Properties:
private int rollno;
private String name;
private double marks[] =new double[5];

Method:
public void inputData()
private double findTotal()
private double findAverage()
public void showData()

*/
import java.util.Scanner;
public class StudentManager {
    private int rollno;
	private String name;
	private double marks[] = new double[5];
	
	public static Student inputData() {
		StudentManager temp=new StudentManager();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll no:");
		temp.rollno=sc.nextInt();
		
		System.out.println("Enter Name:");
		temp.name=sc.next();
		
		for(int i=0;i<temp.marks.length;i++) {
			System.out.println("Enter marks for subject"+(i+1)+":");
			temp.marks[i]=sc.nextDouble();
		}
		return temp;
	}
	
	private double findTotal() {
		double total=0.0;
		for(int i=0;i<marks.length;i++) {
			total=total+marks[i];
		}
		return total;
	}
	
	private double findAverage() {
		return (findTotal()/5);
	}
	
	public void showData() {
		System.out.println("Roll no:"+rollno);
		System.out.println("Name:"+name);
		
		System.out.println(Arrays.toString(marks));
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+"\t");
		}
		System.out.print("\n Total Marks:"+findTotal()+" \t Average Marks:"+findAverage());
	}

	
	
	public static void main(String[] args) {
		StudentManager student=new StudentManager();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students you want to manage:");
		int arraySize=sc.nextInt();
		Student students[]=new Student[arraySize];
		int studentRec=0;
		int choice;
		do {
			System.out.println("Student Manager");
			System.out.println("1. Add New Student Data");
			System.out.println("2. Show All Student Data");
			System.out.println("3. Show Student Data by Roll number");
			System.out.println("4. Show Student Data By Name");
			System.out.println("0. Exit From Menu");
			System.out.println("Enter Your Choice(0-4):");
			choice=sc.nextInt();
			switch(choice) {
				case 1:
					if(studentRec<arraySize) {
						students[studentRec++]=StudentManager.inputData();
						System.out.println("Record has been added..");
						
					}else {
						System.err.println("Can not add more students....");
					}
					
					break;
				case 2:
					if(studentRec!=0) {
					
					for(int i=0;i<students.length && i<studentRec;i++) {
						students[i].showData();
					}
					}else {
						System.err.println("No student record found...");
					}
					break;
				case 3:
					int rollno;
					boolean status=false;
					if(studentRec!=0) {
					
					System.out.println("Enter roll number:");
					rollno=sc.nextInt();
					for(int i=0;i<students.length && i<studentRec;i++) {
						if(students[i].rollno==rollno) {
						students[i].showData();
						status=true;
						break;
						}
					}
					if(!status)
						System.err.println("Entered roll no not found :"+rollno);
					
					}else {
						System.err.println("No student data found...");
					}
					break;
				case 4:
					System.out.println("I will do as student");
					break;
				case 0:
					System.out.println("Terminating application...");
					break;
				default:
					System.err.println("only 0 to 4 are valid choices");
			}
						
		}while(choice!=0);
	}
}
