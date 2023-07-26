import java.util.Scanner;

public class EstudoEstruturaRepeticao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao = entrada.nextInt();

        switch (opcao) { // switch clássico
            case 1:
                System.out.println("Você escolheu a dieta da água!");
                break;
            case 2:
                System.out.println("Você escolheu a dieta da fruta!");
                break;
            case 3:
                System.out.println("Você escolheu a dieta da batata!");
                break;
            default:
                System.out.println("Escolha uma dieta válida!");
                break;
        }
    }
}
