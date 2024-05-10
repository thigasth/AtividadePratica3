package Classses;


import Interface.Trabalhavel;

public class Estagiario extends Funcionario implements Trabalhavel {

    private float horas;
    private String supervisor;
    private Folha f1;

    public Estagiario(){}

    public Estagiario(Folha f1, String nome, int matricula, float horas, String supervisor) {
        super(nome, matricula);
        this.horas = horas;
        this.f1 = f1;
        this.supervisor = supervisor;
    }

    public float getHoras() {
        return horas;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public float calcularSalario() { 
        return f1.salario();
    }

    @Override
    public String trabalhar() {
        return "Estagiario" + getNome() + " está fazendo café para " + supervisor;
    }

    @Override
    public String relatarProgresso() {
        return getNome() + " estagiou " + horas + " horas neste mes";
    }


    @Override
    public String toString() {
        
        return super.toString() + "\n" + trabalhar() + "\n" + relatarProgresso();

    }
    
}
