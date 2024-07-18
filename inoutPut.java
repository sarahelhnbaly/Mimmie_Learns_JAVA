import java.util.Scanner;

class AssignmentOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Output
        System.out.println("Enter your name:");
        
        // Input
        String name = scanner.nextLine();
        
        // Output
        System.out.println("Hello, " + name + "! Java programming is interesting.");
        
        scanner.close();
    }
}
