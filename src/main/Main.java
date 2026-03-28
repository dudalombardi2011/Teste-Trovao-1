package src.main;
import java.util.Scanner;

import src.entidade.Loja;
import src.entidade.Produto;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome da loja: ");
        String nome = sc.nextLine();

        System.out.println("Infome o endereço da loja: ");
        String endereco = sc.nextLine();

        Loja loja = new Loja(nome, endereco);

        System.out.println("Informe a quantidade de produtos: ");
        int qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            System.out.println("Informe os dados do produto" + (i+1)+": ");
            System.out.println("Código: ");
            int codigo = sc.nextInt();
            sc.nextLine();
            System.out.println("Nome: ");
            String name = sc.nextLine();
            System.out.println("Preço: ");
            float preco = sc.nextFloat();
            System.out.println("Quantidade: ");
            int quantidade = sc.nextInt();

            loja.addProduto(new Produto(codigo, name, preco, quantidade));
            
        }

        System.out.println("Produto mais caro: ");
        System.out.println(loja.acharMaisCaro());
        System.out.println("Produto mais barato: ");
        System.out.println(loja.acharMaisBarato());
        System.out.println("Media de preços: ");
        System.out.println(loja.precoMedio());


        sc.close();
        
    }
}
