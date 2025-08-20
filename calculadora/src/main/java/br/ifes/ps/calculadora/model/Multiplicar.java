package br.ifes.ps.calculadora.model;

public class Multiplicar implements Operacao{
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
