package Classses;

import Interface.Trabalhavel;

public class Desenvolvedor extends Funcionario implements Trabalhavel {
    
    private String dominio;
    private Folha f1;

    public Desenvolvedor(){}

    public Desenvolvedor(Folha f1, String nome, int matricula, String dominio) {
        super(nome, matricula);
        this.f1 = f1;
        this.dominio = dominio;
    }

    public Folha getFolha() {
        return f1;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    @Override
    public float calcularSalario() {
        return f1.salario();
    }

    @Override
    public String trabalhar() {
        return "Dev " + getNome() + " está desenvolvendo com " + dominio;
    }

    @Override
    public String relatarProgresso() {
        return getNome() + " está relatando o progresso ";
    }

    @Override
    public String toString() {
        
        return super.toString() + "\n" + trabalhar() + "\n" + relatarProgresso();
        
    }

}
