import java.util.Scanner;

public class Refeicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prato, sobremesa, bebida;
        double calorias = 0.0;

        System.out.println("Escolha seu prato:");
        System.out.println("1 - Vegetariano (180 cal)");
        System.out.println("2 - Peixe (230 cal)");
        System.out.println("3 - Frango (250 cal)");
        System.out.println("4 - Carne (350 cal)");
        prato = scanner.nextInt();

        System.out.println("Escolha sua sobremesa:");
        System.out.println("1 - Abacaxi (75 cal)");
        System.out.println("2 - Sorvete diet (110 cal)");
        System.out.println("3 - Mousse diet (170 cal)");
        System.out.println("4 - Mousse chocolate (200 cal)");
        sobremesa = scanner.nextInt();

        System.out.println("Escolha sua bebida:");
        System.out.println("1 - Chá (20 cal)");
        System.out.println("2 - Suco de laranja (70 cal)");
        System.out.println("3 - Suco de melão (100 cal)");
        System.out.println("4 - Refrigerante diet (65 cal)");
        bebida = scanner.nextInt();

        switch (prato) {
            case 1:
                calorias += 180;
                break;
            case 2:
                calorias += 230;
                break;
            case 3:
                calorias += 250;
                break;
            case 4:
                calorias += 350;
                break;
            default:
                System.out.println("Opção de prato inválida.");
                return;
        }

        switch (sobremesa) {
            case 1:
                calorias += 75;
                break;
            case 2:
                calorias += 110;
                break;
            case 3:
                calorias += 170;
                break;
            case 4:
                calorias += 200;
                break;
            default:
                System.out.println("Opção de sobremesa inválida.");
                return;
        }

        switch (bebida) {
            case 1:
                calorias += 20;
                break;
            case 2:
                calorias += 70;
                break;
            case 3:
                calorias += 100;
                break;
            case 4:
                calorias += 65;
                break;
            default:
                System.out.println("Opção de bebida inválida.");
                return;
        }

        System.out.println("A refeição escolhida possui " + calorias + " calorias.");
    }
}