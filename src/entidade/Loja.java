package src.entidade;

import java.util.ArrayList;

public class Loja {
    private String nome;
    private String endereco;
    private ArrayList<Produto>ListaDeProdutos = new ArrayList<>();

    public Loja(String nome, String endereco){
        this.nome=nome;
        this.endereco=endereco;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString(){
        return "Loja: "+nome + ", endereço: "+ endereco+ ", lista de produtos: "+ ListaDeProdutos;
    }

    public void addProduto(Produto produto){
        ListaDeProdutos.add(produto);
    }

    public Produto acharMaisCaro(){
        Produto maior = ListaDeProdutos.get(0);
        for (Produto obj : ListaDeProdutos){
            if (maior.getpreco()<obj.getpreco()){
                maior=obj;
            }
        }

        return maior;
    }

     public Produto acharMaisBarato(){
        Produto menor = ListaDeProdutos.get(0);
        for (Produto obj : ListaDeProdutos){
            if (menor.getpreco() > obj.getpreco()){
                menor=obj;
            }
        }

        return menor;
    }

    public float precoMedio(){
        float media=0; 
        float preco=0;

        for (Produto obj:ListaDeProdutos){
            preco+=obj.getpreco();
        }
        media = preco/ListaDeProdutos.size();

        return media;
    }
    
}
