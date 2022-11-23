import classroom.Classroom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the classroom! What would you like to do?");
        Scanner scanner = new Scanner(System.in);

        Classroom classroom = new Classroom();

        String input = "";

        do {
            System.out.println("""
                    
                    1. Add a student
                    2. View all students
                    3. View single student by name
                    4. Remove a student
                    5. View students with grade greater than 5
                    6. View students with grade less than 5
                    """);

            input = scanner.nextLine();


            switch (input) {
                case "quit":
                    System.out.println("Exiting application!");
                    break;
                case "1":
                    classroom.addStudent();
                    break;
                case "2":
                    classroom.viewStudents();
                    break;
                case "3":
                    classroom.viewSingleStudentByName();
                    break;
                case "4":
                    classroom.removeStudent();
                    break;
                case "5":
                    classroom.viewStudentsGreater5();
                    break;
                case "6":
                    classroom.viewStudentsLess5();
                    break;

                default:
                    System.out.println("Please select a valid option!");
            }
        } while (!input.equals("quit"));
    }
}
