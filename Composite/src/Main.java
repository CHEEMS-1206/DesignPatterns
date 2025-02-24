import com.designPatterns.Composite.ArrayOfTC;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter number of test cases: ");
        int numTestCases = scanner.nextInt();

        System.out.print("Enter minimum size of test case: ");
        int minSize = scanner.nextInt();

        System.out.print("Enter maximum size of test case: ");
        int maxSize = scanner.nextInt();

        // Create composite object
        ArrayOfTC arrayOfTC = new ArrayOfTC(numTestCases, minSize, maxSize);
        arrayOfTC.generate();

        // Get and print test cases
        List<String> testCases = arrayOfTC.getGeneratedTestCases();
        System.out.println("\nGenerated Test Cases:");
        for (String testCase : testCases) {
            System.out.println(testCase);
        }

        scanner.close();
    }
}
