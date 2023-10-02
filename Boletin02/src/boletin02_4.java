public class boletin02_4 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea o primeiro número");
        double num1= sc.nextFloat();
        System.out.println("Teclea o segundo número");
        double num2= sc.nextFloat();
        System.out.println("La suma es="+(num1+num2));
        System.out.println("La resta es="+(num1-num2));
        System.out.println("La multiplicación es="+(num1*num2));
        System.out.println("El cociente es="+(num1/num2));
    }
}
