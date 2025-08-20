package br.ifes.ps.calculadora.model;

public class Dividir implements Operacao{
    @Override
    public int execute(int a, int b) {
        if(b == 0) throw new ArithmeticException("Divisão por zero");
        return a / b;
    }
}
