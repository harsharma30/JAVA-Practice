import java.util.*;
class StudenttService {
    private Map<Integer, Student> students = new HashMap<>();

    // Add new student
    public void addStudent(Student student) {
        students.put(student.getRollNumber(), student);
    }

    // Search student by roll number
    public Student searchStudent(int rollNumber) {
        if (!students.containsKey(rollNumber)) {
            throw new RollNumberNotFoundException("Roll Number " + rollNumber + " not found.");
        }
        return students.get(rollNumber);
    }

    // Delete student by roll number
    public void deleteStudent(int rollNumber) {
        if (!students.containsKey(rollNumber)) {
            throw new RollNumberNotFoundException("Roll Number " + rollNumber + " not found.");
        }
        students.remove(rollNumber);
    }
     // Search students with avgMarks in given range
     public List<Student> searchStudentsByMarks(double min, double max) {
        List<Student> result = new ArrayList<>();
        for (Student student : students.values()) {
            if (student.getAvgMarks() >= min && student.getAvgMarks() <= max) {
                result.add(student);
            }
        }
        return result;
    }
}

