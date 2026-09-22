
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        System.out.print("Introduzca su año de nacimiento:");    

        Scanner number = new Scanner(System.in);
        int year =number.nextInt();

        int age=2026-year;
        System.out.println("Su edad es: " + age + " años");

        number.close();
    }
}