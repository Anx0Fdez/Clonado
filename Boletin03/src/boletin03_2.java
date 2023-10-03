import java.util.Scanner;

public class boletin03_2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea o valor dos grados Celsius");
        float temperatura=sc.nextFloat();
        float fahrenheit=(temperatura*9/5+32);
        double kelvin =(temperatura+273.15);
        System.out.println("A temperatura en Fahrenheit é igual a ="+fahrenheit);
        System.out.println("A temperatura en Kelvin é igual a ="+kelvin);

    }
}
