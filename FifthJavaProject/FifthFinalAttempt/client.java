
import java.util.Scanner;

public class client {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //creates 3 students
        
        Student[] students = new Student[3];
        for (int i = 0; i < students.length; i++) {
            //student type
            System.out.println("Select student type");
            System.out.println("1. UnderGraduate");
            System.out.println("2. PostGraduate");
            System.out.print("Enter Number Here: ");
            int type = in.nextInt();
            if (type != 1 && type != 2) {
                System.out.println("Invalid student type, Please try again.");
                i--;
                continue;
            }
            in.nextLine(); // skip line
            //create student
            System.out.print("Enter student name: ");
            String name = in.nextLine();
            System.out.print("Enter student ID: ");
            long id = in.nextLong();
            if (type == 1)
                students[i] = new UnderGraduate(name, id);
            else
                students[i] = new PostGraduate(name, id);
            //enter 3 exams score
            System.out.println("Enter 3 exams Results: ");
            for (int j = 0; j < students[i].getNUM_TESTS(); j++) {
                students[i].setTestScore(j, in.nextInt());
            }
            //calculate result
            
            students[i].calculateResult();
            
        }
        //print students 
        System.out.println("\n\nStudents Info:");
        for (Student student : students) {
            System.out.println(student + "\n");
        }
    }
}
