package exemple;
import java.awt.Color;
import java.awt.Font;

import TP.Clignotant;
import TP.Scenario;
import TP.Teletype;
import TP.Zoom;
import bandeau.Bandeau;

public class ExempleDUtilisation {

    public static void main(String[] args) {
        new ExempleDUtilisation().exemple();
    }

    public void exemple() {
        Bandeau monBandeau = new Bandeau();

        // Configuration initiale
        monBandeau.setFont(new Font("SansSerif", Font.BOLD, 20));
        monBandeau.setBackground(Color.WHITE);
        monBandeau.setForeground(Color.BLACK);

        // Création du scénario
        Scenario scenario = new Scenario(monBandeau);

        // Ajout des effets au scénario
        scenario.ajouterEffet(new Teletype(monBandeau, 100), 1);  // Affiche caractère par caractère
        scenario.ajouterEffet(new Clignotant(monBandeau, 5, 300), 2);  // Clignote 5 fois, répété 2 fois
        scenario.ajouterEffet(new Zoom(monBandeau, 10, 100), 1);  // Zoom progressif
        // Exécution du scénario
        scenario.jouer();

        // Message final
        monBandeau.setMessage("Terminé");
        monBandeau.sleep(3000);
        monBandeau.close();
    }
}
