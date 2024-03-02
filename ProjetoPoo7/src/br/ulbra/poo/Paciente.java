package br.ulbra.poo;

public class Paciente extends Pessoa {

        private String cartaoSus;

    public Paciente(String nome, int idade, String sexo, String cpf) {
        super(nome, idade, sexo, cpf);
        this.cartaoSus = cartaoSus;
    }
public void imprimir () {
    super.imprimir();
    System.out.println("Cartão SUS: "+cartaoSus);
}
    }

