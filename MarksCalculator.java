import java.util.Scanner;

public class MarksCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int subCount;
        System.out.println("----- Student Marks & Grade Calculator -----");

        System.out.print("Enter how many subjects: ");
        subCount = sc.nextInt();

        int[] marks = new int[subCount];
        int total = 0;
        double avg = 0;
        String grade = "";

        // Get marks
        for (int i = 0; i < subCount; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            // basic validation
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks. Enter between 0 and 100.");
                i--; // redo this subject
            } else {
                total += marks[i];
            }
        }

        // calculate average
        avg = (double) total / subCount;

        // grade logic
        if (avg >= 90) {
            grade = "A+";
        } else if (avg >= 80) {
            grade = "A";
        } else if (avg >= 70) {
            grade = "B";
        } else if (avg >= 60) {
            grade = "C";
        } else if (avg >= 50) {
            grade = "D";
        } else {
            grade = "F (Fail)";
        }

        // show results
        System.out.println("\n---- Results ----");
        System.out.println("Total Marks: " + total + " / " + (subCount * 100));
        System.out.printf("Average: %.2f%%\n", avg);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
