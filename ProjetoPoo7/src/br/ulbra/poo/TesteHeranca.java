package br.ulbra.poo;

public class TesteHeranca {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Marcelle", 20, "Feminino", "040.076.840-22");
        pessoa.imprimir();
        
        Paciente paciente = new Paciente("MS", 20, "Feminino", "040.076.840-22");
        paciente.imprimir();
        
        Enfermeiro enfermeiro = new Enfermeiro("Marcia", 20, "Feminino", "040.076.840-22");
        enfermeiro.imprimir();
    }
    
            
}
