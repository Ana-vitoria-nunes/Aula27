package Exercicio1;

import java.util.Date;
import java.util.Objects;

abstract class Itens {
    protected String nome;
    protected double preco;
    protected int codgoDeBarras;

    public Itens(String nome, double preco,int codgoDeBarras){
        this.nome=nome;
        this.preco=preco;
        this.codgoDeBarras=codgoDeBarras;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Itens itens)) return false;
        return codgoDeBarras == itens.codgoDeBarras;
    }
    @Override
    public int hashCode() {
        return Objects.hash(codgoDeBarras);
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Itens itens)) return false;
        return Double.compare(itens.preco, preco) == 0 && codgoDeBarras == itens.codgoDeBarras && Objects.equals(nome, itens.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco, codgoDeBarras);
    }*/


    public void mostrarDetalhesDoItem() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Código de Barras: " + codgoDeBarras);

    }
}
