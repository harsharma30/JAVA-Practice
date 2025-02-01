package com.revision;

public class Calculator {
	
	//1st method that neither take input nor return anything.
	public void add1() {
		int num1=12;
		int num2=13;
		int result=num1+num2;
		System.out.println("sum of "+num1+" and "+num2+" is "+result);
	}
	
	//2nd method that takes value but not return
	public void add2(int num1,int num2) {
		int result=num1+num2;
		System.out.println("sum of "+num1+" and "+num2+" is "+result);
	}
	
	//3rd method takes and return values
	public int add3(int num1,int num2) {
		return num1+num2;
	}
	
	//4th method that does not take values but ruturn value
	public int add4() {
		int num1=12;
		int num2=13;
		return num1+num2;
	}
	
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		int num1=12;
		int num2=13;
		
		//calling for 1st type of method
		//calc.add1();
		
		//calling for 2nd type of method
		//calc.add2(num1, num2);
		
		//calling for 3nd type of method
//		int result=calc.add3(num1, num2);
//		System.out.println("sum of "+num1+" and "+num2+" is "+result);
		
		int result=calc.add4();
		System.out.println("sum of "+num1+" and "+num2+" is "+result);
		
	}

}