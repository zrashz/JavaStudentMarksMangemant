
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem(100);  // Adjust capacity as needed

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Update Marks");
            System.out.println("4. Display Student Info");
            System.out.println("5. Display All Students");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter student name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter number of subjects:");
                    int numSubjects = scanner.nextInt();
                    int[] marks = new int[numSubjects];
                    for (int i = 0; i < numSubjects; i++) {
                        System.out.println("Enter marks for subject " + (i + 1) + ":");
                        marks[i] = scanner.nextInt();
                    }
                    sms.addStudent(name, marks);
                    break;
                case 2:
                    System.out.println("Enter student name to remove:");
                    name = scanner.nextLine();
                    sms.removeStudent(name);
                    break;
                case 3:
                    System.out.println("Enter student name to update marks:");
                    name = scanner.nextLine();
                    System.out.println("Enter number of subjects:");
                    numSubjects = scanner.nextInt();
                    marks = new int[numSubjects];
                    for (int i = 0; i < numSubjects; i++) {
                        System.out.println("Enter new marks for subject " + (i + 1) + ":");
                        marks[i] = scanner.nextInt();
                    }
                    sms.updateMarks(name, marks);
                    break;
                case 4:
                    System.out.println("Enter student name to display:");
                    name = scanner.nextLine();
                    sms.displayStudentInfo(name);
                    break;
                case 5:
                    sms.displayAllStudents();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
