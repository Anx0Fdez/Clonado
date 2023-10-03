import java.util.Scanner;

public class boletin03_4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Teclea la cantidad:");
            int cantidad = sc.nextInt();

            int billetes100 = cantidad / 100;
            cantidad = cantidad % 100;

            int billetes20 = cantidad / 20;
            cantidad = cantidad % 20;

            int billetes5 = cantidad / 5;
            cantidad = cantidad % 5;

            int monedas1 = cantidad;

            System.out.println("Desglose de la cantidad:");
            System.out.println("Billetes de 100: " + billetes100);
            System.out.println("Billetes de 20: " + billetes20);
            System.out.println("Billetes de 5: " + billetes5);
            System.out.println("Monedas de 1: " + monedas1);


        }
}
