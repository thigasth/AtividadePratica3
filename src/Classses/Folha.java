package Classses;

public class Folha {

    private float hora;
    private float valorHora;
    private float valor;

    public Folha(){

    }

    public Folha(float hr, float vhr, float valor) {
        this.hora = hr;
        this.valorHora = vhr;
        this.valor = valor;
    }

    public float getHora() {
        return hora;
    }

    public void setHora(float hr) {
        this.hora = hr;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float vhr) {
        this.valorHora = vhr;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float salario(){
        valor = hora * valorHora;
        return valor;
    }

}
