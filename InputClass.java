import java.util.Scanner;

public class InputClass {
	private Scanner sc;
	
	public InputClass() {
		sc = new Scanner(System.in);
	}
	public int inputIntData(String msg) {
		System.out.println(msg);
		return sc.nextInt();
	}
	public double inputDoubleData(String msg) {
		System.out.println(msg);
		return sc.nextDouble();
	}
	
	public String inputStringData(String msg) {
		System.out.println(msg);
		sc.nextLine();
		String temp=sc.nextLine();
		return temp;
	}
}
