package classroom;

import java.util.ArrayList;
import java.util.Scanner;

public class Classroom {

    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);

    public void addStudent(){
        System.out.println("Adding a new student");

        System.out.println("Please insert students name: ");
        String name = scanner.nextLine();

        System.out.println("Please insert students grade: ");
        int grade = intScanner.nextInt();

        System.out.println("Please insert students course: ");
        String course = scanner.nextLine();

        Student student = new Student(name, grade, course);
        students.add(student);
        System.out.println(student.name + " added successfully!");


    }

    public void viewStudents() {
        System.out.println("Viewing all students! \n");

        for (Student student: students) {
            System.out.println("Name: " + student.name + ", Grade: " + student.grade + ", Course: " + student.course);
        }
    }


        public void viewSingleStudentByName() {
            System.out.println("Please enter the name of the student to view!");
            String StudentName = scanner.nextLine();
            for (Student student : students) {
                if (student.name.equals(StudentName)) {
                    System.out.println("Name: " + student.name + ", Grade: " + student.grade + ", Course: " + student.course);
                }
            }
    }
    public void removeStudent() {
        System.out.println("Please enter the name of a student to be removed: ");
        String name = scanner.nextLine();

        for (Student student : students) {
            if (student.name.equals (name)) {

                int index = students.indexOf(student);
                students.remove(index);

                System.out.println(student.name + " Removed successfully!");
return;

            }
        }
    }
    public void viewStudentsGreater5() {
       ArrayList<Student> greaterThan = new ArrayList<>();

       for (Student student : students) {
           if (student.grade > 5) {
               System.out.println("Student name: " + student.name + " Grade: " + student.grade + " Course: " + student.course);

           }
       }
    }
    public void viewStudentsLess5() {
        ArrayList<Student> lessThan = new ArrayList<>();
        for (Student student : students) {
            if (student.grade < 5) {
                System.out.println("Student name: " + student.name + " Grade: " + student.grade + " Course: " + student.course);
            }
        }
    }
}
