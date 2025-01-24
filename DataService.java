import java.util.Scanner;
public class DataService {

	public static void main(String[] args) {
		InputClass input=new InputClass();
		OutputClass out=new OutputClass();
		
		int num1,num2;
		double val1,val2;
		String str1,str2;
		int choice;
		do {
			out.printMessage("1. add numbers");
			out.printMessage("2. add strings");
			out.printMessage("3. add decimals");
			out.printMessage("4. find square");
			out.printMessage("5. find cube");
			out.printMessage("0. exit:");
			choice=input.inputIntData("Enter your choice(0-5):");
			switch(choice) {
			case 1:
				num1=input.inputIntData("Enter first number:");
				num2=input.inputIntData("Enter second number:");
				out.printMessage("Sum is", out.calAdd(num1, num2));
				break;
			case 2:
				str1=input.inputStringData("Enter first string:");
				str2=input.inputStringData("Enter second string:");
				out.printMessage("Joined two string", out.calAdd(str1, str2));
				break;
			case 3:
				val1=input.inputDoubleData("Enter first decimal:");
				val2=input.inputDoubleData("Enter second decimal:");
				out.printMessage("Sum of decimals", out.calAdd(val1, val2));
				break;
			case 4:
				num1=input.inputIntData("Enter number:");
				out.printMessage("Square of number ", out.doAction("square", num1));
				break;
			case 5:
				num1=input.inputIntData("Enter number:");
				out.printMessage("Cube of number ", out.doAction("cube", num1));
				break;
			case 0:
				System.out.println("Terminating application ...");
				break;
			default:
				System.err.println("Invalid choice.. valid choices are 0-5 only...");
			}
		}while(choice!=0);
	}
}