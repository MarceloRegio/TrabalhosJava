package aulaherancajava;

import java.util.Calendar;
import java.util.Date;

public class Empregado {


private String nome;

private double salario;

private Date dataContratacao;



public Empregado(String n, double s, Calendar c) {

nome = n;
salario = s;

Date d = new Date();
d.setTime(c.getTimeInMillis());

dataContratacao = d; 

}

public String getNome() {

return nome;

}

public void setNome(String nome) {

this.nome = nome;

}

public double getSalario() {

return salario;

}

public void setSalario(double salario) {

this.salario = salario;

}

public Date getDataContratacao() {

return dataContratacao;

}

public void setDataContratacao(Date dataContratacao) {

this.dataContratacao = dataContratacao;

}

public void promocao(double porcentagem)

{

double novoSalario = salario * porcentagem / 100;

salario += novoSalario;

}

}