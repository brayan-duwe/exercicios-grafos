import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma palavra: ");
            String texto = scanner.nextLine();

            String invertida = "";

            for (int i = texto.length() - 1; i >= 0; i--) {
                invertida += texto.charAt(i);
            }

            System.out.println("Invertida: " + invertida);
        }
    }
}