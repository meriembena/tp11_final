package TP;
import bandeau.Bandeau;
 
public class Teletype extends Effet {
    private int delay;

    public Teletype(Bandeau bandeau, int delay) {
        super(bandeau);
        this.delay = delay;
    }

    @Override
    public void jouer() {
        String message = bandeau.getMessage();
        StringBuilder displayed = new StringBuilder();

        for (char c : message.toCharArray()) {
            displayed.append(c);
            bandeau.setMessage(displayed.toString());
            bandeau.sleep(delay);
        }
    }
}
