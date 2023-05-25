package Exercicio1;
public class Loja {
    public static void main(String[] args) {

        Itens[] formas =new Itens[7];

        formas[0]=new Livros("O poder do hábito",50.70,14598," Charles Duhigg");
        formas[1]=new DVDs("Rio 2",39.90,14598,1);
        formas[2]=new CDs("Calsinha Preta",10,25489753,5);
        formas[3]=new DVDs("Cidade De Deus",29.90,3697133,1);
        formas[4]=new Livros("O poder do hábito",50.70,14598," Charles Duhigg");
        formas[5]=new Livros("O poder do hábito",50.70,14598," Charles Duhigg");
        formas[6]=new Livros("O poder do hábito",50.70,1459896," Charles Duhigg");
        //Livros livros;
       // livros=new Livros("As coisas que você só vê quando desacelera",42.31,369742511,"Haemin Sunim");


        int i=0;
        for (Itens forma:formas){
            forma.mostrarDetalhesDoItem();
            System.out.println("-------------------------");

            if(forma.nome.equals("Rio 2")){
                System.out.println(forma.nome+" encontrado na posição "+(i+1));
                break;
            }
            if (i== formas.length-1){
                System.out.println("Elemento não encontrado");
            }
            i++;

        }
        /*for (int i=0;i<formas.length;i++){
            if(formas[i].nome.equals("Rio")){
                System.out.println(formas[i].nome+" encontrado na posição "+(i+1));
                break;
            }
            if (i== formas.length-1){
                System.out.println("Elemento não encontrado");
            }
        }*/
        System.out.println("Comparação 1: "+formas[0].equals(formas[4]));
        System.out.println("Comparação 2: "+(formas[0]==formas[4]));

    }
}
