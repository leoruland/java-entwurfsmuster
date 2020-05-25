package de.leoruland.beispiele.observer;

import java.util.LinkedList;
import java.util.List;

public class SubjektModel implements Subjekt {
    private List<Beobachter> beobachterListe;
    @Override
    public List<Beobachter> getBeobachterListe() {
        return beobachterListe;
    }

    @Override
    public void anmeldenBeobachter(Beobachter beobachter) {
        beobachterListe.add(beobachter);
    }

    @Override
    public void abmeldenBeobachter(Beobachter beobachter) {
        beobachterListe.remove(beobachter);
    }

    @Override
    public void benachrichtigen() {
        for (Beobachter beobachter: beobachterListe) {
            beobachter.aktualisieren(this);
        }
    }

    @Override
    public void zustandAendern() {
        // Dinge veraendern
        zaehler++;
        // Benachrichtigen
        this.benachrichtigen();
    }

    public SubjektModel() {
        beobachterListe = new LinkedList<>();
        zaehler = 0;
    }

    // Modellspezifische Eigenschaften
    private int zaehler;
    public int getZaehler() {
        return zaehler;
    }
}
