
import java.util.Locale;
import java.util.Scanner;

public class Simulador_de_Pedidos {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Pergunta a quantidade de itens que o cliente vai pedir

        System.out.print("Quantos itens o cliente vai pedir? ");

        int qtd_Itens = sc.nextInt();
        sc.nextLine();

        double valor_Total = 0.0;

        // Estrutura de repetição para registrar cada item 

        for (int i = 1; i <= qtd_Itens; i++) {
            System.out.println("\n--- item " + i + " ---");

            System.out.print("Nome do item : ");
            String nome_item = sc.nextLine();

            System.out.print("Preço do " + nome_item +": R$ ");
            double preco_Item = sc.nextDouble();
            sc.nextLine();

        // Soma o preço ao total acumulado 

         valor_Total += preco_Item;

        }
            
            System.out.println("\n -------------------------------------");
            System.out.printf("Subtotal: R$ %.2f%n" , valor_Total);

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


    }
}


