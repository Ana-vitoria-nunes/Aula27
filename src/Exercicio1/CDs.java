package Exercicio1;

public class CDs extends Itens{
    public int duracao;
    public CDs(String nome,double preco,int codgoDeBarras,int duracao){
        super(nome, preco,codgoDeBarras);
        this.duracao=duracao;
    }
    public void mostrarDetalhesDoItem(){
        System.out.println("Nome: "+nome);
        System.out.println("Preço: "+preco);
        System.out.println("Duração: "+duracao);
        System.out.println("Código de Barras: "+codgoDeBarras);

    }
}
