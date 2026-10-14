import java.util.Scanner;

public class ex3 {

    // Autômato do exercício 1
    // Aceita somente a palavra AAB
    public static boolean aceitaAAB(String palavra) {
    int estado = 0;

    for (int i = 0; i < palavra.length(); i++) {
        char simbolo = palavra.charAt(i);

        switch (estado) {

            // Esperando o primeiro A
            case 0:
                if (simbolo == 'A')
                    estado = 1;
                else
                    return false;
                break;

            // Esperando o segundo A
            case 1:
                if (simbolo == 'A')
                    estado = 2;
                else
                    return false;
                break;

            // Esperando B
            case 2:
                if (simbolo == 'B')
                    estado = 3;
                else
                    return false;
                break;

            // Terminou um AAB
            // Pode começar outro grupo
            case 3:
                if (simbolo == 'A')
                    estado = 1;
                else
                    return false;
                break;
        }
    }

    return estado == 3;
}


    // Autômato do exercício 2
    // Aceita números binários ímpares
    public static boolean aceitaImparBinario(String numero) {
        int estado = 0;

        for (int i = 0; i < numero.length(); i++) {
            char simbolo = numero.charAt(i);

            if (simbolo == '0') {
                estado = 0;
            } else if (simbolo == '1') {
                estado = 1;
            } else {
                return false;
            }
        }

        return estado == 1;
    }


    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int opcao;

            do {

                System.out.println("\n===== EXERCÍCIO 3 =====");
                System.out.println("1 - Testar palavra AAB");
                System.out.println("2 - Testar número binário ímpar");
                System.out.println("0 - Sair");
                System.out.print("Escolha: ");

                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {

                    case 1:
                        System.out.print("Digite uma palavra: ");
                        String palavra = scanner.nextLine().toUpperCase();

                        if (aceitaAAB(palavra)) {
                            System.out.println("Palavra ACEITA!");
                        } else {
                            System.out.println("Palavra REJEITADA!");
                        }

                        break;

                    case 2:
                        System.out.print("Digite um número binário: ");
                        String numero = scanner.nextLine();

                        if (aceitaImparBinario(numero)) {
                            System.out.println("Número ACEITO! É ímpar.");
                        } else {
                            System.out.println("Número REJEITADO!");
                        }

                        break;

                    case 0:
                        System.out.println("Encerrando...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            } while (opcao != 0);
        }
    }
}