import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente("Samuel Machado Duarte", 22);
        Conta conta = new Conta(cliente, 2500, TipoConta.CORRENTE);

        //Exibe Dados da Conta
        System.out.println(conta.mostraDados());

        //Gera o menu
        String opcoes;
        opcoes = """
                Operações
                
                1 - Consultar Saldo
                2 - Depositar Valor
                3 - Retirar Valor
                4 - Sair
                """;

        int valor;
        for (boolean flag = true; flag == true;) {
            System.out.println(opcoes);
            int opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    System.out.println(conta.getSaldo());
                    break;
                case 2:
                    System.out.println("Digite o valor a depositar: ");
                    valor = scanner.nextInt();
                    System.out.println(conta.depositar(valor));
                    break;
                case 3:
                    System.out.println("Digite o valor a retirar: ");
                    valor = scanner.nextInt();
                    System.out.println(conta.retirar(valor));
                    break;
                case 4:
                    System.out.println("PROGRAMA ENCERRADO!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA, TENTE NOVAMENTE");
                    break;
            }


        }
    }
}