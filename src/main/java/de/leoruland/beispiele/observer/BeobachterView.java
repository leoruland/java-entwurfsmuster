package de.leoruland.beispiele.observer;

public class BeobachterView implements Beobachter {
    @Override
    public void aktualisieren(Subjekt subjekt) {
        SubjektModel sub = (SubjektModel) subjekt;
        this.aktuellerZaehler = sub.getZaehler();
        this.anzeige();
    }

    // Viewspezifische Eigenschaften
    private int aktuellerZaehler;
    public BeobachterView(Subjekt subjekt) {
        SubjektModel sub = (SubjektModel) subjekt;
        aktuellerZaehler = sub.getZaehler();
    }
    public void anzeige() {
        System.out.println("Aktueller Zaehlerstand = " + aktuellerZaehler);
    }
}
