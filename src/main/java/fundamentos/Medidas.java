// 1 - Pacote
package fundamentos;

// 2 - Bibliotecas
import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos
    static Scanner entrada = new Scanner(System.in);

    // 3.2 - Métodos e Funções
     public static void main(String[] args){
         String opcao;
         int area = 0; // Receber o resultado dos cálculos de áreas

         System.out.println("Escolha o Calculo Desejado");
         System.out.println("(1) - Area do Quadrado");
         System.out.println("(2) - Area do Retangulo");
         System.out.println("(3) - Area do Triangulo");
         System.out.println("(4) - Area do Circulo");


         opcao = entrada.nextLine(); // Leitura da opção
         switch(opcao){
             case "1":
                 area = calcularAreaDoQuadrado();
                 break;
             case "2":
                 // ToDo: calcular área do retângulo
                 break;
             default:
                 System.out.println("Opção Inválida: " + opcao);
         }
         if (area > 0) {
             System.out.println("A área é de " + area + "m²");
         }
     }

     public static int calcularAreaDoQuadrado(){

         int lado; // Tamanho do lado do quadrado

         System.out.println("Digite o tamanho do lado: ");
         lado = entrada.nextInt(); // Leitura do tamanho do lado
         return lado * lado; // Retorna a área do quadrado

     }
}
