package Exercicio_Java;


public class Circulo implements Figura{
    private String nome;
    private double area;
   private double raio;

    public Circulo(String nome, double area, double raio) {
        this.nome = nome;
        this.area = area;
        this.raio = raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
   
   
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String getNome() {
      
        return nome;
    }

    @Override
    public double getArea() {
    
      area =  Math.pow(raio, 2);
        return area;
    }
    

}