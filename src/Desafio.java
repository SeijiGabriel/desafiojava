import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Peter Park";
        String tipoConta = "Corrente";
        double saldo = 1599.99;

        System.out.println("**********************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n**********************************");

        int opcao = 0;
        Scanner leitura = new Scanner(System.in);
        String menu = """
                ***Digite sua opção***
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        while(opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();
            
            if(opcao == 1){
                System.out.println("Seu saldo atual é de " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor da transferência?");
                double valor = leitura.nextDouble();
                if(valor > saldo) {
                    System.out.println("Saldo insuficiente");
                }else {
                    saldo -= valor;
                    System.out.println("Saldo atual: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atual: " + saldo);
            }else if (opcao != 4){
                System.out.println("Operação inválida");
            }
        }
    }
}
