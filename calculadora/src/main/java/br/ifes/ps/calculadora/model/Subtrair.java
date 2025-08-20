package br.ifes.ps.calculadora.model;

public class Subtrair implements Operacao {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
