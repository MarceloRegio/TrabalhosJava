package Exercicio_Java;

public class Triangulo implements Figura{

   private String nome;
    private double area;
    private double base,altura;

    public Triangulo(String nome, double area, double base, double altura) {
        this.nome = nome;
        this.area = area;
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
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
        
    area = (base*altura)/2;
        return area;
    }
    

}