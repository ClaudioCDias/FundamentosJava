package fundamentos;

import static fundamentos.Medidas.entrada;
import static fundamentos.Medidas.tabuada;

public class Calculos {

    public static void main(String[] args){
        System.out.print("Deseja calcular a tabuada? <S/N>");
        String resposta = entrada.nextLine();
        System.out.println("Resposta: " + resposta);
        switch (resposta){
            case "S":
            case "s":
                      tabuada();
                      break;
            default:
                System.out.println("Escolheu outro texto diferente de \"S\"");
        }
    }
}
