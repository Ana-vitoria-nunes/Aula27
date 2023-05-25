package Exercicio2;

public class Quadrado extends Retangulo{
    public Quadrado(float lado) {
        super(lado);
    }
    public float calcularArea(){
        float area= 2*lado;
        return area;

    }
    public  float calcularPerimetro(){
        float perimetro= 2*(2*lado);
        return perimetro;
    }
}

