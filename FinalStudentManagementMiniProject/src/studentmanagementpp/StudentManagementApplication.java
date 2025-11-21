package studentmanagementpp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import static studentmanagementpp.Student.getCount;

public class StudentManagementApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of students registered : " + getCount());

        List<Student> students = new ArrayList<>();

        // Optional sample student for testing
        Student s = new Student("Alice", 20.0f);
        students.add(s);

        int choice = 0;
        do {
            System.out.println();
            System.out.println("Welcome to Student Management System");
            System.out.println("======================================");
            System.out.println("1. Register New Student");
            System.out.println("2. Display Details");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Sort Students by Marks (descending)");
            System.out.println("6. Sort Students by Name (A-Z)");
            System.out.println("-1. Exit");
            System.out.print("Enter your choice: ");

            // read choice safely (keeps simple)
            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid integer choice.");
                sc.nextLine(); // consume invalid token
                continue;
            }
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine().trim();
                    if (name.isEmpty()) {
                        System.out.println("Name cannot be empty.");
                        break;
                    }

                    System.out.print("Enter marks (float): ");
                    if (!sc.hasNextFloat()) {
                        System.out.println("Please enter a valid float for marks.");
                        sc.nextLine();
                        break;
                    }
                    float marks = sc.nextFloat();
                    sc.nextLine(); // consume newline

                    Student newStudent = new Student(name, marks);
                    students.add(newStudent);
                    System.out.println("Student registered with roll number: " + newStudent.getRollNumber());
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students to display.");
                    } else {
                        System.out.println("Roll Number | Name | Marks");
                        for (Student stud : students) {
                            System.out.println(stud.toString());
                        }
                    }
                    break;

                case 3: // Search Student
                    System.out.println("Search by: 1) Roll Number  2) Name");
                    System.out.print("Enter option: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid option.");
                        sc.nextLine();
                        break;
                    }
                    int opt = sc.nextInt();
                    sc.nextLine();
                    if (opt == 1) {
                        System.out.print("Enter roll number to search: ");
                        if (!sc.hasNextInt()) {
                            System.out.println("Invalid roll number.");
                            sc.nextLine();
                            break;
                        }
                        int roll = sc.nextInt();
                        sc.nextLine();
                        Student found = null;
                        for (Student t : students) {
                            if (t.getRollNumber() == roll) {
                                found = t;
                                break;
                            }
                        }
                        if (found != null) {
                            System.out.println("Student found:");
                            System.out.println(found.toString());
                        } else {
                            System.out.println("No student with roll number " + roll);
                        }
                    } else if (opt == 2) {
                        System.out.print("Enter name (or part of name) to search: ");
                        String q = sc.nextLine().trim().toLowerCase();
                        boolean any = false;
                        for (Student t : students) {
                            if (t.getName().toLowerCase().contains(q)) {
                                if (!any) {
                                    System.out.println("Matches:");
                                    any = true;
                                }
                                System.out.println(t.toString());
                            }
                        }
                        if (!any) System.out.println("No matching students for \"" + q + "\"");
                    } else {
                        System.out.println("Invalid search option.");
                    }
                    break;

                case 4: // Delete Student by roll number
                    System.out.print("Enter roll number to delete: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid roll number.");
                        sc.nextLine();
                        break;
                    }
                    int rollToDelete = sc.nextInt();
                    sc.nextLine();
                    Student toRemove = null;
                    for (Student t : students) {
                        if (t.getRollNumber() == rollToDelete) {
                            toRemove = t;
                            break;
                        }
                    }
                    if (toRemove != null) {
                        students.remove(toRemove);
                        System.out.println("Student with roll number " + rollToDelete + " deleted.");
                        // Note: We do not decrement static count to keep roll numbers unique over time
                    } else {
                        System.out.println("No student found with roll number " + rollToDelete);
                    }
                    break;

                case 5: // Sort by marks (descending)
                    if (students.size() <= 1) {
                        System.out.println("Not enough students to sort.");
                    } else {
                        Collections.sort(students, Comparator.comparing(Student::getMarks).reversed());
                        System.out.println("Students sorted by marks (highest first).");
                    }
                    break;

                case 6: // Sort by name (A-Z)
                    if (students.size() <= 1) {
                        System.out.println("Not enough students to sort.");
                    } else {
                        Collections.sort(students, Comparator.comparing(Student::getName, String.CASE_INSENSITIVE_ORDER));
                        System.out.println("Students sorted by name (A - Z).");
                    }
                    break;

                case -1:
                    System.out.println("Thank you. Exiting.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != -1);

        sc.close();
    }
}
