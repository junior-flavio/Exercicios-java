import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(Digite o número de carros vendidos );
        int numCarrosVendidos = scanner.nextInt();

        System.out.print(Digite o valor total das vendas );
        double valorTotalVendas = scanner.nextDouble();

        System.out.print(Digite o salário fixo );
        double salarioFixo = scanner.nextDouble();

        System.out.print(Digite o valor por carro vendido );
        double valorPorCarroVendido = scanner.nextDouble();

        double comissaoPorCarro = valorPorCarroVendido  numCarrosVendidos;
        double comissaoPorVendas = valorTotalVendas  0.05;
        double salarioFinal = salarioFixo + comissaoPorCarro + comissaoPorVendas;

        System.out.printf(O salário final do vendedor é R$%.2f, salarioFinal);
    }
}