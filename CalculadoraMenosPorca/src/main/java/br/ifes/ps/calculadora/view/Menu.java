package br.ifes.ps.calculadora.view;

import br.ifes.ps.calculadora.controller.ControllerCalc;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Menu {

    public void show(){
        Scanner s = new Scanner(System.in);
        System.out.println("Calculadora Simples");
        System.out.println("Selecione a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("0 - Sair");
        System.out.print("Opção: ");
        int opcao = s.nextInt();
        System.out.print("Digite o primeiro número: ");
        int numero1 = s.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = s.nextInt();

        ControllerCalc controller = new ControllerCalc();
        try{
            int resultado = controller.OperacaoCalcular(opcao,numero1, numero2);
            System.out.println("Resultado: " + resultado);

        }catch (Exception e){
            e.fillInStackTrace();
        }

    }
}
