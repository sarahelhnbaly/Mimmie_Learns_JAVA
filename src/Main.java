import com.sun.jdi.Value;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Test obj1 = new Test(15);
        System.out.println(obj1.age);
        Test obj2 = new Test(22);
        System.out.println(obj2.age);


        }
    }
    class Test{
        int age;
        String message;

        Test(){
        System.out.println("I am a Constructor");
    }
    Test(int value){
            this.age = value;
            System.out.println("I am setting age " );

    }
    Test(int value, String message){
            this.age = value;
            this.message = message;
            System.out.println("I am setting message, and age" + "Hi1 ");
    }



    }
