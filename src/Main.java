import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 2500.00;
        String nome = "Samuel Pires Barbosa";
        String conta = "Conta corrente";

        System.out.println("***************************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome:  " + nome);
        System.out.println("Tipo de conta: " + conta);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("***************************************************");

        System.out.println("""
                DIGITE UMA OPÇÃO
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                """);

        int digito = scanner.nextInt();

        while (digito != 4) {

            if (digito == 1) {
                System.out.println("O saldo é de: R$" + saldo);

            } else if (digito == 2) {

                System.out.println("Informe o valor a receber: ");
                double valorAtualizado = scanner.nextDouble();
                valorAtualizado = saldo + valorAtualizado;
                System.out.println("Saldo atualizado R$" + valorAtualizado);

            } else if (digito == 3) {

                System.out.println("Informe o valor que deseja transferir: ");
                double valorTransferido = scanner.nextDouble();
                if (valorTransferido > saldo) {

                    System.out.println("Saldo insuficiente");

                } else {
                    saldo = saldo - valorTransferido;
                    System.out.println("Saldo atualizado R$" + saldo);
                }
            }
            System.out.println("Digite a opção desejada: ");
            digito = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Programa encerrado");
    }
}
