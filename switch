
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter day number");
        int noOfDay = obj.nextInt();
        String day = switch (noOfDay) {
            case 1, 7 -> "Weekend, sleep well";
            case 2, 3, 4, 5, 6 -> "Weekdays, do your BEST!";
            default -> "Error - wrong input";
        };
        System.out.println(day);
    }
}
