//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator obj1 = new Calculator(15,"Hello World");
        System.out.println(obj1.age);
        System.out.println(obj1.message);
        Calculator obj2 = new Calculator(22,"I LOVE YOU");
        System.out.println(obj2.age);
        System.out.println(obj2.message);
        Calculator obj3 = new Calculator();
        System.out.println(obj3.age);
        System.out.println(obj3.message);


        }
    }
