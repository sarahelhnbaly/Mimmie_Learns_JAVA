import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s =" ";
        String name="Ashutosh";
        String name2="Ashutosh";
        String name3=new String("Ashutosh");
        String name4=new String("Ashutosh");
        System.out.println("s");
        System.out.println(name);
        System.out.println("I am" + name);
        System.out.println(2+3+name);
        System.out.println(name + 2+3 );
        System.out.println(2+3+name);
        System.out.println(name.charAt(1) );
        System.out.println(name.substring(1));
        System.out.println(name.substring(0,1));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name==name2);
        System.out.println(name.trim());
        System.out.println(name.equals(name2));
        System.out.println(name3==name4);
        System.out.println(name3.equals(name4));
        System.out.println(name.startsWith("a"));
        System.out.println(name.endsWith("y"));
        System.out.println(name.replace('a','y'));
        System.out.println(name.replace("a","y"));




















    }
}


