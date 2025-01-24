public class OutputClass {
	public int calAdd(int num1,int num2) {
		return num1+num2;
	}
	public String calAdd(String str1,String str2) {
		return str1+str2;
	}
	
	public double calAdd(double num1,double num2) {
		return num1+num2;
	}
	
	public int doAction(String operation,int num) {
		int result=0;
		if(operation.equals("square"))
		return num*num;
		else if(operation.equals("cube"))
			return num*num*num;
		else return -1;
	}
	
	public void printMessage(String msg) {
		System.out.println(msg);
	}
	public void printMessage(String msg,int result) {
		System.out.println(msg+":"+result);
	}
	public void printMessage(String msg,double result) {
		System.out.println(msg+":"+result);
	}
	public void printMessage(String msg,String result) {
		System.out.println(msg+":"+result);
	}
}
