import java.util.Scanner;
public class StudentGrades
{
    public static void main(String[] args)
    {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the Rollnumber of students: ");
        int numStudents = obj.nextInt();

        for (int i = 1; i < numStudents; i++) {
            System.out.print("Enter the marks for student " + numStudents + ": ");
            int marks = obj.nextInt();

            char grade;
            if (marks >= 90) {
                grade = 'A';
            } else if (marks >= 80) {
                grade = 'B';
            } else if (marks >= 70) {
                grade = 'C';
            } else if (marks >= 60) {
                grade = 'D';
            } else if (marks >= 50) {
                grade = 'E';
            } else {
                grade = 'F';
            }
            System.out.println("Grade for student " + (i + 1) + " is: " + grade);
            if(marks > 100)
            {
                System.out.println("Invalid marks entered");
            }
        }
        
    }
}