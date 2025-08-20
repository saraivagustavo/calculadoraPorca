package br.ifes.ps.calculadora.model;

public class Calculadora {
    public int calcular(Operacao operacao, int valor1, int valor2) throws IllegalArgumentException {
        if (operacao == null) {
            throw new IllegalArgumentException("Operação não pode ser nula");
        }

       return operacao.execute(valor1, valor2);
   }
}
