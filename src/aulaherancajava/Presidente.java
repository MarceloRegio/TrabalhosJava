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
public class Presidente extends Empregado{
    int nsecretarias;

    public Presidente(String n, double s, Calendar c,int nsecretarias) {
        super(n, s, c);
        this.nsecretarias = nsecretarias;
    }

    public int getNsecretarias() {
        return nsecretarias;
    }

    public void setNsecretarias(int nsecretarias) {
        this.nsecretarias = nsecretarias;
    }
        
}
