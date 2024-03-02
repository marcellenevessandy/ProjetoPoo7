package br.ulbra.poo;

public class Enfermeiro extends Pessoa {
    private double numHoras;
    private String numCracha;

    public Enfermeiro(String nome, int idade, String sexo, String cpf) {
        super(nome, idade, sexo, cpf);
        this.numHoras = numHoras;
        this.numCracha = numCracha;
    }
    
    public void imprimir (){
    super.imprimir();
        System.out.println("Número de horas: "+ numHoras
        +"Número crachá: "+ numCracha);
    }
}
