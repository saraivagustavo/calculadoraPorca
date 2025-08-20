package br.ifes.ps.calculadora.controller;

import br.ifes.ps.calculadora.model.Calculadora;
import br.ifes.ps.calculadora.model.Operacao;

public class ControllerCalc {
    public int operacaoCalcular(Operacao operacao, int valor1, int valor2){
        Calculadora calculadora = new Calculadora();
        return calculadora.calcular(operacao, valor1, valor2);
    }
}
