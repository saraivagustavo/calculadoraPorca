package br.ifes.ps.calculadora.model;

public interface Operacao {

    public int execute (int a, int b);

    default int getNumeroOperandos(){
        return 2;
    }
}
