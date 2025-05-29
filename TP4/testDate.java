import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AfficherDateHeure {
    public static void main(String[] args) {
        // Obtenir la date et l'heure courantes
        LocalDateTime maintenant = LocalDateTime.now();

        // Formater la date et l'heure (optionnel)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // Afficher la date et l'heure formatées
        String dateHeureFormatee = maintenant.format(formatter);
        System.out.println("Date et heure courantes : " + dateHeureFormatee);
    }
}