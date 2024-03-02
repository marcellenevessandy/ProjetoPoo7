package br.ulbra.poo;

public class Pessoa {

    protected String nome;
    protected int idade;
    protected String sexo;
    protected String cpf;

    public Pessoa(String nome, int idade, String sexo, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome
                + "Idade: " + idade
                + "Sexo: " + sexo
                + "CPF: " + cpf);
    }
}
