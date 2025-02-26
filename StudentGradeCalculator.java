package InternshipCodsoftTask;
import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        float averagePercentage = (float) totalMarks / (numSubjects * 100) * 100;

        char grade;
        if (averagePercentage >= 85) {
            grade = 'A';
        } else if (averagePercentage >= 70) {
            grade = 'B';
        } else if (averagePercentage >= 55) {
            grade = 'C';
        } else if (averagePercentage >= 33) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("----------------------------");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: "+ averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}