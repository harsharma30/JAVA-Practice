import java.util.*;
class Studentt {
    private int rollNumber;
    private String name;
    private double avgMarks;

    public Student(int rollNumber, String name, double avgMarks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.avgMarks = avgMarks;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getAvgMarks() {
        return avgMarks;
    }

    @Override
    public String toString() {
        return "Student{Roll Number=" + rollNumber + ", Name='" + name + "', Avg Marks=" + avgMarks + "}";
    }
}

class RollNumberNotFoundException extends RuntimeException {
    public RollNumberNotFoundException(String message) {
        super(message);
    }
}

