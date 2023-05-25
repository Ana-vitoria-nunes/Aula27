package Exercicio2;

public class Circulo extends Forma{
     protected float raio;
     protected float tipo;
     public Circulo(float raio,float tipo){
         this.raio=raio;
         this.tipo=tipo;
     }

    public float calcularArea(){

        return (float) ((raio*raio)*Math.PI);

    }
    public  float calcularPerimetro(){

        return (float) (2*Math.PI*raio);
    }
}
