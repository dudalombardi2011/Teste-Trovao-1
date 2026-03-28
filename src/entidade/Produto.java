package src.entidade;
public class Produto {
    private Integer codigo;
    private String nome;
    private float preco;
    private Integer quantidade;

    public Produto(Integer codigo, String nome, float preco, Integer quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void setcodigo(Integer codigo){
        this.codigo=codigo;
    }

    public Integer getcodigo(){
        return codigo;
    }
        
    public void setnome(String nome){
        this.nome=nome;
    }

    public String getnome(){
        return nome;
    }

    public void setpreco(float preco){
        this.preco=preco;
    }

    public float getpreco(){
        return preco;
    }

    public void setquantidade(Integer quantidade){
        this.quantidade=quantidade;
    }

    public Integer getquantidade(){
        return quantidade;
    }

     @Override
    public String toString() {
        return "Produto:" + "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade;
    }


}