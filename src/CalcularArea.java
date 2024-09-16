import java.util.Scanner;
import java.lang.Math;

public class CalculadoraArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opcao = 0;

        while (opcao!=3) {
            System.out.println(
                    """
                    ---Calculadora de área---
                    
                    1. Calcular área do quadrado
                    2. Calcular área do círculo
                    3. Sair
                    
                    Escolha uma opção:
                    """);
            opcao = scan.nextInt();

            if (opcao ==1) {
                System.out.print("Digite o lado do quadrado: ");
                double ladoQuadrado = scan.nextDouble();
                double areaQuadrado = Math.pow(ladoQuadrado, 2);
                System.out.printf("A área do quadrado é " + areaQuadrado);
            } else if (opcao == 2) {
                System.out.println("Digite o raio do círculo: ");
                double raioCirculo = scan.nextDouble();
                double areaCirculo = Math.PI * Math.pow(raioCirculo, 2);
                System.out.printf("A área do círculo é " + areaCirculo);
            } else if (opcao == 3) {
                System.out.println("Programa encerrado");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
                break;
            }

        }
    }
}