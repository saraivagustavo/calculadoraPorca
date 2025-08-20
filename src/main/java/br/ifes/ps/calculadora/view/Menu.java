package br.ifes.ps.calculadora.view;

import br.ifes.ps.calculadora.controller.ControllerCalc;
import br.ifes.ps.calculadora.model.Operacao;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Menu {
    public void show() {

        Scanner s = new Scanner(System.in);
        Reflections reflections = new Reflections("br.ifes.ps.calculadora.model");
        int opcao;
        do{
            //pegar todas as classes que implementam a interface Operacao
            Set<Class<? extends Operacao>> classesDeOperacoes = reflections.getSubTypesOf(Operacao.class);
            //transformar o set em uma lista pra manipular mais fácil
            List<Class<? extends Operacao>> operacoesList = new ArrayList<>(classesDeOperacoes);

            System.out.println("\n=================================");
            System.out.println("Calculadora Simples");
            System.out.println("Selecione a operação:");
            System.out.println("=================================");

            //loop pra exibir as operações disponíveis no menu através das classes encontradas com o reflections
            for (int i = 0; i < operacoesList.size(); i++) {
                System.out.println((i + 1) + " - " + operacoesList.get(i).getSimpleName());
            }

            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = s.nextInt();

            // verificação pra ver se a opção é pra sair
            if (opcao == 0) {
                continue;
            }

            //verificação pra ver se digitou opção inválida
            if(opcao < 1 || opcao > operacoesList.size()) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            try {
                //pegar a classe selecionada pelo usuário e instanciar um objeto dela
                Class<? extends Operacao> classeSelecionada = operacoesList.get(opcao - 1);
                //usando reflexão para instanciar a classe selecionada
                Operacao operacao = classeSelecionada.getDeclaredConstructor().newInstance();

                int numero1 = 0;
                int numero2 = 0;

                //o primeiro número sempre vai ser necessário
                System.out.print("Digite o primeiro número: ");
                numero1 = s.nextInt();

                //problema do fatorial: só tem um número pra calcular, verificar dependendo da operação
                if (operacao.getNumeroOperandos() == 2) {
                System.out.print("Digite o segundo número: ");
                numero2 = s.nextInt();
                }

                //chamar o controller para calcular a operação com os números informados e a operação
                ControllerCalc controller = new ControllerCalc();
                int resultado = controller.operacaoCalcular(operacao, numero1, numero2);

                System.out.println("Resultado: " + resultado);

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
    } while (opcao != 0);
        System.out.println("Calculadora encerrada.");
    }
}
