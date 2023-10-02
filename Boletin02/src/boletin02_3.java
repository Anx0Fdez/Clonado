public class boletin02_3 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea o cambio");
        float cambio= sc.nextFloat();
        System.out.println("Teclea os euros");
        float euros= sc.nextFloat();
        System.out.println("O importe de euros a dolares é igual a="+(euros*cambio));
    }
}
