package TP;
import java.awt.Font;

import bandeau.Bandeau;

public class Zoom extends Effet {
    private int steps;
    private int delay;


    public Zoom(Bandeau bandeau, int steps, int delay) {
        super(bandeau);
        this.steps = steps;
        this.delay = delay;
    }

    @Override
    public void jouer() {
        Font originalFont = bandeau.getFont();
        int originalSize = originalFont.getSize();

        for (int i = 0; i < steps; i++) {
            bandeau.setFont(new Font(originalFont.getName(), originalFont.getStyle(), originalSize + i));
            bandeau.sleep(delay);
        }

        // Restaure la taille d'origine
        bandeau.setFont(originalFont);
    }
}
