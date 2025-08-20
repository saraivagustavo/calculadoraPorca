package br.ifes.ps.calculadora.model;

public class Calculadora {
   public int calcular(int opcao, int valor1, int valor2) throws Exception {

       Operacao operacao = null;

       switch (opcao) {
           case 1:
               operacao = new Somar();
               break;
           case 2:
               operacao = new Subtrair();
               break;
           case 3:
               operacao = new Multiplicar();
               break;
           case 4:
               operacao = new Dividir();
               break;
           default:
               throw new Exception("Não existe a opção");
       }

       return operacao.execute(valor1, valor2);
   }
}
