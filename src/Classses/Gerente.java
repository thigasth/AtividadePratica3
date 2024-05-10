package Classses;

import Interface.Trabalhavel;

public class Gerente extends Funcionario implements Trabalhavel {

    private float Bonus;
    private String equipe;
    private Folha f1;

    public Gerente(){}

    public Gerente(Folha f1, String nome, int matricula, float bonus, String equipe) {
        super(nome, matricula);
        Bonus = bonus;
        this.f1 = f1;
        this.equipe = equipe;
    }

    public Folha getFolha() {
        return f1;
    }
    

    public float getBonus() {
        return Bonus;
    }


    public void setBonus(float bonus) {
        Bonus = bonus;
    }


    public String getEquipe() {
        return equipe;
    }


    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }


    @Override
    public float calcularSalario() {
        return f1.salario() + Bonus;
    }


    @Override
    public String trabalhar() {
        return "Gerente " + getNome() + " está tomando o café feito por um estagiario da equipe de " + equipe;
    }


    @Override
    public String relatarProgresso() {
        return getNome() + " ganhou R$ " + Bonus + " por sua gerencia";
    }

    @Override
    public String toString() {
        
        return super.toString() + "\n" + trabalhar() + "\n" + relatarProgresso();
        
    }

}