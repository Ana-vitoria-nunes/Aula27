package Exercicio2;
public class Main {
    public static void main(String[] args) {
        Forma forma[]=new Forma[5];

        forma[0]=new Retangulo(5,7);
        forma[1]=new Circulo(9,38);
        forma[2]=new Retangulo(1,10);
        forma[3]=new Quadrado(6);
        forma[4]=new Circulo(5,6);

        for (Forma formas:forma){
            System.out.println(formas.calcularArea());
            System.out.println(formas.calcularPerimetro());
            System.out.println("-------------------------");
        }

    }
}
