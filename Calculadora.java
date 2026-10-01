import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int repetir = 1;

        while (repetir == 1) {

            System.out.println("Qual operação deseja fazer?");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.print("Digite: ");

            int operacao = scanner.nextInt();

            System.out.print("Digite o primeiro número: ");
            double primeiroNumero = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double segundoNumero = scanner.nextDouble();

            switch (operacao) {

                case 1:
                    double soma = primeiroNumero + segundoNumero;
                    System.out.println("A soma dos números " + primeiroNumero
                            + " + " + segundoNumero + " = " + soma);
                    break;

                case 2:
                    double subtracao = primeiroNumero - segundoNumero;
                    System.out.println("A subtração dos números " + primeiroNumero
                            + " - " + segundoNumero + " = " + subtracao);
                    break;

                case 3:
                    double multiplicacao = primeiroNumero * segundoNumero;
                    System.out.println("A multiplicação dos números " + primeiroNumero
                            + " * " + segundoNumero + " = " + multiplicacao);
                    break;

                case 4:
                    if (segundoNumero == 0) {
                        System.out.println("Não é possível dividir por zero.");
                    } else {
                        double divisao = primeiroNumero / segundoNumero;
                        System.out.println("A divisão dos números " + primeiroNumero
                                + " / " + segundoNumero + " = " + divisao);
                    }
                    break;

                default:
                    System.out.println("Operação inválida.");
            }

            System.out.println();
            System.out.println("Deseja repetir?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            System.out.print("Digite: ");

            repetir = scanner.nextInt();

            System.out.println();
        }

        System.out.println("Programa encerrado.");

        scanner.close();
    }
}