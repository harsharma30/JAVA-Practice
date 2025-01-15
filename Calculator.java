public class Calculator{
    public int addNumber(int num1, int num2){
        return (num1 + num2);
    }
    public int subNumber(int num1, int num2){
        return (num1 + num2);
    }
    public int mulNumber(int num1, int num2){
        return (num1 * num2);
    }
    public int divNumber(int num1, int num2){
        return (num1 / num2);
    }
    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println("Sum of two numbers: " + calc.addNumber(12,5));
        System.out.println("Difference of two numbers: " + calc.subNumber(12,5));
        System.out.println("Product of two numbers: " + calc.mulNumber(12,5));
        System.out.println("Division of two numbers: " + calc.divNumber(12,5));

    }
}