public class FullTimeEmployee{
    private int empID;
    
    public  FullTimeEmployee(int empID){
        this.empID = empID;
    }

    public  FullTimeEmployee(){

    }
    public double findSalary(double value){
        return value+(value*.30)+(value*.20)+(value*.10);
    }
    public showEmployeeData(){
        System.out.println("Employee id: "+empID+"Salary :"+findSalary(value));
    }
}