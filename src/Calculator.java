public class Calculator {
    int age;
    String message;

    Calculator() {
        System.out.println("I am a Constructor");
    }

    Calculator(int value) {
        this.age = value;
        System.out.println("I am setting age ");

    }

    Calculator(int value, String message) {
        this.age = value;
        this.message = message;
        System.out.println("I am setting message, and age" + "Hi1 ");
    }


}
