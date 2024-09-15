
import java.util.Scanner;

public class StudentManagementSystem {
    private student[] students;
    private int studentCount;

    // Constructor
    public StudentManagementSystem(int capacity) {
        students = new student[capacity];
        studentCount = 0;
    }

    // Add a student
    public void addStudent(String name, int[] marks) {
        students[studentCount++] = new student(name, marks);
    }

    // Remove a student by name
    public void removeStudent(String name) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getName().equals(name)) {
                students[i] = students[--studentCount];
                students[studentCount] = null;
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Update marks for a student
    public void updateMarks(String name, int[] newMarks) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getName().equals(name)) {
                students[i].setMarks(newMarks);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Display student information
    public void displayStudentInfo(String name) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getName().equals(name)) {
                System.out.println("Name: " + students[i].getName());
                System.out.println("Total Marks: " + students[i].getTotalMarks());
                System.out.println("Average Marks: " + students[i].getAverageMarks());
                System.out.println("Highest Mark: " + students[i].getHighestMark());
                System.out.println("Lowest Mark: " + students[i].getLowestMark());
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Display all students
    public void displayAllStudents() {
        for (int i = 0; i < studentCount; i++) {
            displayStudentInfo(students[i].getName());
            System.out.println();
        }
    }
}
