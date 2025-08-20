package br.ifes.ps.calculadora.model;

public class Exponencial implements Operacao{
    @Override
    public int execute(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
