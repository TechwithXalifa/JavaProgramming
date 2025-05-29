import java.util.Scanner;

public class Exercice21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une phrase : ");
        String phrase = scanner.nextLine();
        System.out.print("Entrez un mot : ");
        String mot = scanner.nextLine();

        boolean motTrouve = rechercherMot(phrase, mot);

        if (motTrouve) {
            System.out.println("Le mot \"" + mot + "\" est présent dans la phrase.");
        } else {
            System.out.println("Le mot \"" + mot + "\" n'est pas présent dans la phrase.");
        }

        scanner.close();
    }

    public static boolean rechercherMot(String phrase, String mot) {
        if (mot.length() > phrase.length()) {
            return false;
        }

        for (int i = 0; i <= phrase.length() - mot.length(); i++) {
            boolean correspondance = true;
            for (int j = 0; j < mot.length(); j++) {
                if (phrase.charAt(i + j) != mot.charAt(j)) {
                    correspondance = false;
                    break;
                }
            }
            if (correspondance) {
                return true;
            }
        }
        return false;
    }
}
    