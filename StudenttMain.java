import java.util.*;
public class StudenttMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudenttService studentService = new StudentService();

        while (true) {
            System.out.println("\n1. Add Student\n2. Search Student\n3. Delete Student\n4. Search Students by Marks\n5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    int roll = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Average Marks: ");
                    double marks = scanner.nextDouble();
                    studentService.addStudent(new Student(roll, name, marks));
                    System.out.println("Student added successfully.");
                    break;
                
                case 2:
                    System.out.print("Enter Roll Number to Search: ");
                    try {
                        Student student = studentService.searchStudent(scanner.nextInt());
                        System.out.println(student);
                    } catch (RollNumberNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                
                case 3:
                    System.out.print("Enter Roll Number to Delete: ");
                    try {
                        studentService.deleteStudent(scanner.nextInt());
                        System.out.println("Student deleted successfully.");
                    } catch (RollNumberNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Enter Min Marks: ");
                    double min = scanner.nextDouble();
                    System.out.print("Enter Max Marks: ");
                    double max = scanner.nextDouble();
                    List<Student> students = studentService.searchStudentsByMarks(min, max);
                    if (students.isEmpty()) {
                        System.out.println("No students found in the given range.");
                    } else {
                        students.forEach(System.out::println);
                    }
                    break;
                
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Invalid choice! Try again.");
                }
            }
        }
    }



