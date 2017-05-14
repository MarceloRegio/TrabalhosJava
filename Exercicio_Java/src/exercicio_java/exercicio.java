package Exercicio_Java;

/**
 *
 * @author Marcelow
 */
public class exercicio {

    public static void main(String[] args) {
        
      Quadrado quadrado = new Quadrado("Quadrado", 0 , 2, 2);
      Triangulo triangulo = new Triangulo("Triangulo", 0, 2, 5);
      Circulo circulo = new Circulo("Circulo", 0, 5);
      
        System.out.println("Quadrado: " + quadrado.getNome() +"\n Area: "+ quadrado.getArea()+"\n");
        System.out.println("Triangulo: " + triangulo.getNome() +"\n Area: "+ triangulo.getArea()+"\n");
        System.out.println("Circulo: " +circulo.getNome() + "\n Raio: " + circulo.getArea()+"\n");
       
      
        
      
    }

    private exercicio(String circulo, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}