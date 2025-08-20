package br.ifes.ps.calculadora.view;

import br.ifes.ps.calculadora.controller.ControllerCalc;
import br.ifes.ps.calculadora.model.Operacao;
import org.reflections.Reflections;

import java.util.Scanner;
import java.util.Set;


public class Menu {
    public void show(){
        Scanner s = new Scanner(System.in);

        System.out.println("Calculadora Simples");
        System.out.println("Selecione a operação:");

        Reflections reflections = new Reflections("br.ifes.ps.calculadora.model");

        Set<Class<? extends Operacao>> classes = reflections.getSubTypesOf(Operacao.class);
        int i = 1;
        for(Class<? extends Operacao> operacoes : classes) {
            System.out.println(i+") " + operacoes.getSimpleName());
            i++;
        }

        System.out.println("0 - Sair");
        System.out.print("Opção: ");
        int opcao = s.nextInt();
        System.out.print("Digite o primeiro número: ");
        int numero1 = s.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = s.nextInt();

        ControllerCalc controller = new ControllerCalc();
        try{
            int resultado = controller.OperacaoCalcular(opcao, numero1, numero2);
            System.out.println("Resultado: " + resultado);
        }catch(Exception e){
            e.fillInStackTrace();
        }

    }
}
