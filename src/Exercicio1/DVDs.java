package Exercicio1;

public class DVDs extends Itens{
    public int faixas;

    public DVDs(String nome,double preco,int codgoDeBarras,int faixas){
        super(nome, preco,codgoDeBarras);
        this.faixas=faixas;
    }
    public void mostrarDetalhesDoItem(){
        System.out.println("Nome: "+nome);
        System.out.println("Preço: "+preco);
        System.out.println("Faixas: "+faixas);
        System.out.println("Código de Barras: "+codgoDeBarras);

    }
}
