
package studentlist;

import java.util.Scanner;

/**
 * This class +++Insert Description Here+++
 *
 * @author Sheena Manuel
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //for an array of String
       //String[] Students = new String[3];
       Student[] students = new Student[2];
       Scanner input = new Scanner(System.in);
       System.out.println("Enter student names");
       for(int i = 0; i<students.length; i++){
           System.out.println("Enter name for student " +(i + 1) );
           String name = input.nextLine();
           students[i] = new Student(name);
       }
        System.out.println("Here are the students ");
        String format = "Student name is: %s\n";
       //each student is in(:) students 
       for (Student student: students){
           System.out.printf(format, student.getName());
       }
    }

}
