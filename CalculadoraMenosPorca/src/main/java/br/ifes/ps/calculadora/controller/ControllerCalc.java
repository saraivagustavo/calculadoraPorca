package br.ifes.ps.calculadora.controller;

import br.ifes.ps.calculadora.model.Calculadora;

public class ControllerCalc {

    public int OperacaoCalcular (int opcao, int valor1, int valor2) throws Exception {
        Calculadora calculadora = new Calculadora();
        return calculadora.calcular(opcao,valor1,valor2);
    }
}
