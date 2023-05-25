package Exercicio1;

public class Livros extends Itens{
    public String autor;
    public Livros(String nome,double preco,int codgoDeBarras,String autor){
        super(nome, preco,codgoDeBarras);
        this.autor=autor;
    }
    public void mostrarDetalhesDoItem(){
        System.out.println("Nome: "+nome);
        System.out.println("Preço: "+preco);
        System.out.println("Autor: "+autor);
        System.out.println("Código de Barras: "+codgoDeBarras);

    }
}
