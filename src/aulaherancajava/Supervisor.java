/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaherancajava;

import java.util.Calendar;

/**
 *
 * @author Marcelo
 */
public class Supervisor extends Empregado{
    private String setor;

    public Supervisor(String n, double s, Calendar c,String setor) {
        super(n, s, c);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    
}
