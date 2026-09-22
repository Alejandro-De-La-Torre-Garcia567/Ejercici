
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        System.out.print("Introduzca su año de nacimiento:");    

        Scanner number = new Scanner(System.in);

        int year =number.nextInt();


        System.out.print("Introduzca el año actual:");


        int currentYear = number.nextInt();

        int age=currentYear-year;

    if(year <0){


            System.out.println("Error, el año de nacimiento no puede ser negativo");
            return;

    }

    if(currentYear <0){

            System.out.println("Error, el año actual no puede ser negativo");
            return;
    }

    if(year>currentYear){

            System.out.println("Error, el año de nacimiento no puede ser mayor que el año actual");
            return;
    }

        System.out.println("Su edad es: " + age + " años");

        number.close();
    }
}