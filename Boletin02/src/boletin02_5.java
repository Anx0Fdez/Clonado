public class boletin02_5 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea a distancia en millas");
        double millas= sc.nextFloat();
        final int VALOR = 1852;
        System.out.println("La distancia en metros es="+(VALOR*millas));

    }
}
