package Exercicio_Java;

public class Quadrado implements Figura{
    
    private String nome;
    private double area;
    private double ladoA,ladoB;

    public Quadrado(String nome, double area, double ladoA, double ladoB) {
        this.nome = nome;
        this.area = area;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
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
        
        area = ladoA*ladoB;
        return area;
    }
    

}