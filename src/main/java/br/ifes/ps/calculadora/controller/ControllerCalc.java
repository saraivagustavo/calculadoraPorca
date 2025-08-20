package br.ifes.ps.calculadora.controller;

import br.ifes.ps.calculadora.model.Calculadora;
import br.ifes.ps.calculadora.model.Operacao;

public class ControllerCalc {
    public int operacaoCalcular(Operacao operacao, int valor1, int valor2) throws Exception {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.calcular(operacao, valor1, valor2);
        return resultado;
    }
}
