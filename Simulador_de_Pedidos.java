

import java.util.Locale;
import java.util.Scanner;

public class Simulador_de_Pedidos {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Menu

        System.out.println("1 - Fazer Pedido ");
        System.out.println("2 - Historico de Pedidos ");
        System.out.println("3 - Sair");

        int opcao = sc.nextInt();

        switch (opcao) {

            case 1:

                // Pergunta a quantidade de itens que o cliente vai pedir

                System.out.println("Quantos itens o cliente vai pedir? ");

                int qtd_Itens = sc.nextInt();
                sc.nextLine();

                double valor_Total = 0.0;

                // Validar se a quantidade de itens é maior que zero

                System.out.println("\n -------------------------------------");

                while (qtd_Itens < 1) {
                    System.out.println("Quantidade inválida");
                    System.out.println("Digite novamente ");
                    qtd_Itens = sc.nextInt();
                    sc.nextLine();
                }

                System.out.println("\n -------------------------------------");

                // Estrutura de repetição para registrar cada item

                for (int i = 1; i <= qtd_Itens; i++) {
                    System.out.println("\n--- item " + i + " ---");

                    System.out.print("Nome do item : ");
                    String nome_item = sc.nextLine();

                    System.out.print("Preço do " + nome_item + ": R$ ");
                    double preco_Item = sc.nextDouble();
                    sc.nextLine();

                    // Soma o preço ao total acumulado

                    valor_Total += preco_Item;

                }

                System.out.println("\n -------------------------------------");
                System.out.printf("Subtotal: R$ %.2f%n", valor_Total);

                // Pergunta se o cliente possui cadastro

                System.out.println("O cliente é cadastrado? (s/n): ");
                String cliente_Cadastrado = sc.nextLine().strip().toLowerCase();

                // Aplica o desconto de 10% se for cadastrado

                if (cliente_Cadastrado.equals("s")) {
                    double desconto = valor_Total * 0.10;
                    double valor_Final = valor_Total - desconto;
                    System.out.printf("Desconto aplicado (10%%): R$ %.2f%n", desconto);
                    System.out.printf("Valor total com o desconto: R$ %.2f", valor_Final);

                } else {
                    double valor_Final = valor_Total;
                    System.out.println("Nenhum desconto aplicado");
                    System.out.printf("Valor total a pagar: R$ %.2f", valor_Final);

                }

                System.out.println("\n -------------------------------------");

                System.out.println("Escolha uma Opção para fazer o pagamento");

                System.out.println("\n -------------------------------------");

                System.out.println("1 - Credito  ");
                System.out.println("2 - Debito ");
                System.out.println("3 - Pix ");
                System.out.println("4 - Dinheiro ");

                System.out.println("\n -------------------------------------");

                int formaPagamento = sc.nextInt();

                switch (formaPagamento) {

                    case 1:
                        System.out.println("confirmar pagamento no Crédito");
                        break;
                    case 2:
                        System.out.println("confirmar pagamento no Debito");
                        break;
                    case 3:
                        System.out.println("confirmar pagamento no Pix");
                        break;
                    case 4:
                        System.out.println("confirmar pagamento no Dinheiro");
                        break;

                    default:


                    
                        System.out.println("Opção invalida");

                }

                break;

            case 2:
                System.out.println("Histórico em desenvolvimento");
                break;
            case 3:
                System.out.println("Saida");
                break;

            default:

                System.out.println("Opção invalida");

        }
    }
}
