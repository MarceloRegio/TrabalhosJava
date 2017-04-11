/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaherancajava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Marcelo
 */
public class Gerente extends Empregado {
    private double bonus;
    
    public Gerente(String n, double s, Calendar c) {
        super(n, s, c);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        Date d = new Date();
        d.setTime(c.getTimeInMillis()); 
        bonus= 0;
    }

@Override
public double getSalario(){   

    return super.getSalario()+bonus;
}

public  double getBonus(){

return bonus;

}
public void setBonus(double b){

bonus = b;

}
    
}
