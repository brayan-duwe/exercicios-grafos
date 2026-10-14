import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma String: ");
            String texto = scanner.nextLine();

            char[] caracteres = texto.toCharArray();

            for (int i = 0; i < caracteres.length - 1; i++) {

                for (int j = 0; j < caracteres.length - 1 - i; j++) {

                    if (caracteres[j] > caracteres[j + 1]) {

                        char auxiliar = caracteres[j];
                        caracteres[j] = caracteres[j + 1];
                        caracteres[j + 1] = auxiliar;
                    }
                }
            }

            String ordenada = new String(caracteres);

            System.out.println("String ordenada: " + ordenada);
        }
    }
}