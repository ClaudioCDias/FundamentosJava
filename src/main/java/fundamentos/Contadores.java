package fundamentos;

public class Contadores extends Medidas implements ContadoresMedidas {
    public static void main(String[] args){
        System.out.println("Deseja realizar contagem regressiva? <S/N>");
        String resposta = entrada.nextLine();
        switch (resposta){
            case "S":
            case "s":
                ContadoresMedidas.contagemRegressiva();
                break;
            default:
                System.out.println("Digitou outro texto diferente de \"S\"");
        }
    }
}
