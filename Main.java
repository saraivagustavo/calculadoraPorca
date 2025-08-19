import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double numero1, numero2, resultado;
        int opcao;

        Scanner s = new Scanner(System.in);

        System.out.println("Calculadora Simples");
        System.out.println("Selecione a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("0 - Sair");
        System.out.print("Opção: ");
        opcao = s.nextInt();

        while(opcao != 0) {
            System.out.print("Digite o primeiro número: ");
            numero1 = s.nextDouble();
            System.out.print("Digite o segundo número: ");
            numero2 = s.nextDouble();

            switch (opcao) {
                case 1:
                    resultado = numero1 + numero2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println("\nSelecione a operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = s.nextInt();
        }
        System.out.println("Calculadora encerrada.");
    }
}
