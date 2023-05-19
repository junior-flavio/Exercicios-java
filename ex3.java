import java.util.Scanner;

public class CaracteristicasFisicas {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int numFemininos = 0;
        int numFemininosOlhosCastanhosCabelosCastanhos = 0;
        int total = 0;
        
        while (true) {
            System.out.println("Informe os dados de uma pessoa ou -1 para encerrar:");
            
            System.out.print("Sexo (m/f): ");
            char sexo = input.next().charAt(0);
            while (sexo != 'm' && sexo != 'f') {
                System.out.print("Entrada inválida. Por favor, informe 'm' ou 'f': ");
                sexo = input.next().charAt(0);
            }
            
            System.out.print("Cor dos olhos (a, v, c ou p): ");
            char corOlhos = input.next().charAt(0);
            while (corOlhos != 'a' && corOlhos != 'v' && corOlhos != 'c' && corOlhos != 'p') {
                System.out.print("Entrada inválida. Por favor, informe 'a', 'v', 'c' ou 'p': ");
                corOlhos = input.next().charAt(0);
            }
            
            System.out.print("Cor dos cabelos (l, c, p ou r): ");
            char corCabelos = input.next().charAt(0);
            while (corCabelos != 'l' && corCabelos != 'c' && corCabelos != 'p' && corCabelos != 'r') {
                System.out.print("Entrada inválida. Por favor, informe 'l', 'c', 'p' ou 'r': ");
                corCabelos = input.next().charAt(0);
            }
            
            System.out.print("Idade em anos (entre 10 e 100): ");
            int idade = input.nextInt();
            while (idade < 10 || idade > 100) {
                System.out.print("Entrada inválida. Por favor, informe uma idade entre 10 e 100: ");
                idade = input.nextInt();
            }
            
            System.out.print("Valor do salário: ");
            double salario = input.nextDouble();
            while (salario < 0) {
                System.out.print("Entrada inválida. Por favor, informe um valor positivo: ");
                salario = input.nextDouble();
            }
            
            total++;
            
            if (sexo == 'f') {
                numFemininos++;
                if (corOlhos == 'c' && corCabelos == 'c' && idade >= 18 && idade <= 35) {
                    numFemininosOlhosCastanhosCabelosCastanhos++;
                }
            }
            
            if (idade == -1) {
                break;
            }
        }
        
        double percentual = (double)numFemininosOlhosCastanhosCabelosCastanhos / numFemininos * 100;
        
        System.out.println("Porcentagem de mulheres com olhos e cabelos castanhos entre 18 e 35 anos: " + percentual + "%");
        System.out.println("Total de pessoas cadastradas: " + total);
        
        input.close();
    }
    
}
