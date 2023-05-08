package A6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gerente gerente = new Gerente();
        Programador programador = new Programador();
        int resposta = -1;
        int aumenta;
        gerente.setNome("Hugo");
        programador.setNome("Patrick");
        gerente.setSalario(4000);
        programador.setSalario(4000);
        while (resposta != 0) {
            do {
                System.out.print("Digite 1 para imprimir dados\nDigite 2 para Aumentar Salario!\nDigite 0 para sair\nDigite: ");
                resposta = scanner.nextInt();
            } while (resposta != 0 && resposta != 1 && resposta != 2);
            if (resposta == 1) {
                System.out.println("\nNome do programador: " + programador.getNome() + "\nSalário do programador: " + programador.getSalario());
                System.out.println("Nome do gerente: " + gerente.getNome() + "\nSalário do gerente:" + gerente.getSalario()+"\n");
            } if(resposta == 2) {
                do {
                    System.out.print("\nDigite 1: para aumentar salario do programador\n" +
                            "Digite 2: para aumentar salario do gerente\nDigite: ");
                    aumenta = scanner.nextInt();
                } while (aumenta != 1 && aumenta != 2);
                if (aumenta == 1) {
                    programador.aumentaSalario();
                    System.out.println("Salário do programador ajustado para " + programador.getSalario());
                } else {
                    gerente.aumentaSalario();
                    System.out.println("Salário do gerente ajustado para " + gerente.getSalario());
                }
            }
        }
        System.out.println("Fim do programa");
    }
}