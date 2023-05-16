
//voici une calculatrice simple, efecctuant les quatre opération de base:
import java.util.Scanner;

public class CalculatriceSimple {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le premier nombre:");
        double num1 = scanner.nextDouble();

        System.out.println("Entrez le second nombre:");
        double num2 = scanner.nextDouble();

        System.out.println("Entrez une opération (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        scanner.close();
        double output;

        switch (operation) {
            case '+':
                output = num1 + num2;
                break;

            case '-':
                output = num1 - num2;
                break;

            case '*':
                output = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    output = num1 / num2;
                } else {
                    System.out.println("Erreur! Division par zéro n'est pas possible.");
                    return;
                }
                break;

            // opération non reconnue
            default:
                System.out.println("Erreur! opération invalide.");
                return;
        }

        System.out.println("Le résultat est: " + output);
    }
}
