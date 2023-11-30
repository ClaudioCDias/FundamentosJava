// 1 - Pacote
package fundamentos;

// 2 - Bibliotecas
import java.util.Locale;
import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos
    static Scanner entrada = new Scanner(System.in);

    // 3.2 - Métodos e Funções
     public static void main(String[] args) {
         String opcao = "";
         int area = 0; // Receber o resultado dos cálculos de áreas

         while (!opcao.toUpperCase().equals("S")){

             System.out.println("Escolha o Calculo Desejado");
             System.out.println("(1) - Area do Quadrado");
             System.out.println("(2) - Area do Retangulo");
             System.out.println("(3) - Area do Triangulo");
             System.out.println("(4) - Area do Circulo");
             System.out.println("(5) - Tabuada");
             System.out.println("(6) - Fibonacci");
             System.out.println("(7) - Contagem Regressiva");
             System.out.println("(8) - Divisão por Zero");
             System.out.println("(S) - Sair");

         opcao = entrada.nextLine(); // Leitura da opção
         switch (opcao) {
             case "1":
                 area = calcularAreaDoQuadrado();
                 break;
             case "2":
                 // ToDo: calcular área do retângulo
                 break;
             case "5":
                 tabuada();
                 break;
             case "6":
                 fibonacci();
                 break;
             case "7":
                 contagemRegressiva();
                 break;
             case "8":
                 divisaoPorZero();
                 break;
             case "S":
             case "s":
                 System.out.println("Agradecemos pela preferência! Fui!!!");
                 break;
             default:
                 System.out.println("Opção Inválida: " + opcao);
         }
         if (area > 0) {
             System.out.println("A área é de " + area + "m²");
         }
       }

     }

     public static int calcularAreaDoQuadrado(){

         int lado; // Tamanho do lado do quadrado

         System.out.println("Digite o tamanho do lado: ");
         lado = entrada.nextInt(); // Leitura do tamanho do lado
         // Desenhar o quadrado
         for(int linha = 1; linha <= lado; linha+=2){
             for(int coluna = 1; coluna <= lado; coluna++) {
                 System.out.print("#");
             }
             System.out.println(""); // Pular de linha
         }
         System.out.println(""); // Pular de linha
         return lado * lado; // Retorna a área do quadrado

     }

     public static void tabuada(){
         System.out.println("Você quer calcular a tabuada de qual número?");
         byte numero = entrada.nextByte();

         for (byte i=1;i<=10;i++){
             System.out.print(numero * i + " ");
         }
     }
     public static void fibonacci(){
         System.out.print("Quantos números deseja calcular na sequência?");
         byte numero = entrada.nextByte();

         switch(numero){
             case 0:
                 System.out.println("A sequência está vazia");
                 break;
             case 1:
                 System.out.print("Sequencia de Fibonacce: 1");
                 break;
             default:
                 int num1 = 0;
                 int num2 = 1;

                 System.out.print("Sequencia de Fibonacci: 1 ");
                 for(byte i = 2; i <= numero; i++ ){
                     int fib = num1 + num2;
                     System.out.print(fib + " ");
                     num1 = num2;
                     num2 = fib;
                 }
         }
     }

     public static void contagemRegressiva(){

         System.out.print("Começar a contagem a partir de qual número?");
         int numero = entrada.nextInt();

         System.out.print("Diminuindo de quantos em quantos por vez?");
         int decrescimo = entrada.nextInt();

         for (int i = numero; i >= 1; i -= decrescimo){

             System.out.println(i);
         }
     }

     public static void divisaoPorZero(){
         System.out.println("Qual é o dividendo? (numero a ser dividido)");
         int dividendo = entrada.nextInt();
         System.out.println("Qual é o divisor? (numero que divide o dividendo)");
         int divisor = entrada.nextInt();
     }

}
