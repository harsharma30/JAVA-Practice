
public class Student1 {
    private int rollNumber;
    private String name;
    private double avgMarks;
    public int setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getAvgMarks(){
        return avgMarks;
    }
    public void setAvgMarks(double avgMarks){
        this.avgMarks = avgMarks;
    }
    public Student(int number, String name, double avgMarks){
        this.rollNumber = rollNumber;
        this.name = name;
    }
}
