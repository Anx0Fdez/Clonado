import java.util.Scanner;

public class boletin03_1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea o prezo da tarifa");
        float prezotarifa= sc.nextFloat();
        System.out.println("Teclea o prezo pagado");
        float prezopagado= sc.nextFloat();
        float porcentaxe= (100-(prezopagado*100/prezotarifa));
        System.out.println("O desconto total é = "+porcentaxe);


    }
}
