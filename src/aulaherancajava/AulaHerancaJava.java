package aulaherancajava;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class AulaHerancaJava {

public static void main(String[] args) {

    Calendar c1 = Calendar.getInstance();
    c1.set(11,9,2015); // calendar bruto A,M,D
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY"); // Setou o formato pra data desejada
    Date d = new Date(); // precisa de um date auxiliar para transformar em milisegundos
    d.setTime(c1.getTimeInMillis()); // transformado em milisegundos 
    
    Gerente gerente = new Gerente("Andre", 3000, c1);
    Empregado e1 = new Empregado ("Jão",500,c1) ;
    Empregado e2 = new Empregado ("Luiz",600,c1);
    Empregado e3 = new Empregado ("Marquito",700,c1);
    Presidente p = new Presidente ("Ze",3000,c1,3);
    Supervisor s = new Supervisor ("Tiao",15000,c1,"Producao");
    
    List <Empregado> emp = new ArrayList();
    emp.add(gerente);
    emp.add(e1);
    emp.add(e2);
    emp.add(e3);
    emp.add(p);
    emp.add(s);
    
    for ( Empregado em : emp ) {        
       System.out.println("nome "+em.getNome()+" salario "+em.getSalario()+" data: "+sdf.format(d));
    }
    
    /*System.out.println("nome "+e1.getNome()+" salario "+e1.getSalario()+" data: "+sdf.format(d));// depois de transformado em milisegundos com o date
    //com esse método foi transformado o milisegundos em data normal ano/mes/dia.*/

    }

}