package Exercicio2;
public class Retangulo extends Forma {
    protected float lado;
    protected float altura;

    public Retangulo(float lado,float altura){
        this.lado=lado;
        this.altura=altura;
    }
    public Retangulo(float lado){
        this.lado=lado;
    }

    public float calcularArea(){


        return  lado*altura;

    }
    public  float calcularPerimetro(){
        float area=(lado+altura)*2;
        return area;
    }
}
