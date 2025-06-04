import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        List<String> studentIds = new ArrayList<>(); // List to store multiple student IDs
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your id (or type 'exit' to finish): ");
            String currentId = scanner.nextLine();

            if (currentId.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter your programming 2 grade: ");
            double programming2 = scanner.nextDouble();
            System.out.print("Enter your ITPE 1 grade: ");
            double itpe1 = scanner.nextDouble();
            System.out.print("Enter your NS 1 grade: ");
            double ns1 = scanner.nextDouble();
            System.out.print("Enter your English grade: ");
            double english = scanner.nextDouble();
            System.out.print("Enter your MATH 1 grade: ");
            double math1 = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            System.out.println("\n--- STUDENT FINAL GRADES ---");
            System.out.println("Student Id: " + currentId);
            System.out.println("Programming 2 grade: " + programming2);
            System.out.println("ITPE 1 grade: " + itpe1);
            System.out.println("NS 1 Grade: " + ns1);
            System.out.println("English Grade: " + english);
            System.out.println("MATH 1 Grade: " + math1);

            double gradeAverage = (programming2 + itpe1 + ns1 + english + math1) / 5;
            System.out.println("Grade Average: " + gradeAverage);

            String result = (gradeAverage >= 60) ? "passed" : "failed";
            System.out.println("Results of Grades: " + result);

            studentIds.add(currentId); // Store id in the list variable named studentIds
        }

        System.out.println("\nAll student IDs entered:");
        for (String id : studentIds) {
            System.out.println(id);
        }

        scanner.close(); // Close the scanner
    }
}
