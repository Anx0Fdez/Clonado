import java.util.Scanner;

public class boletin03_5 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea o valor do teu soldo fixo");
        float sf=sc.nextFloat();
        System.out.println("Teclea o valor das tuas vendas");
        double vendas=0.05*sc.nextFloat();
        System.out.println("Teclea o valor dos teus kilometros recorridos");
        float km=2*sc.nextFloat();
        System.out.println("Teclea o valor dos dias de desprazamento");
        float dia=30*sc.nextFloat();
        double sl= (sf+vendas+km+dia);
        System.out.println("O saldo líquido é igual a="+sl);

    }
}
