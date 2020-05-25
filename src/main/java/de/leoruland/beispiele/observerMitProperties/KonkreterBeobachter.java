package de.leoruland.beispiele.observerMitProperties;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class KonkreterBeobachter implements PropertyChangeListener {
    // Gehoert zum Entwurfsmuster
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName() == "zaehlerstand") {
            aktuellerZaehlerstand = (int) evt.getNewValue();
            anzeige();
        } else if (evt.getPropertyName() == "anderes") {
            System.out.println("Dafuer bin ich nicht zustaendig.");
        }
    }
    // Gehoert zum Programm
    private int aktuellerZaehlerstand;
    public KonkreterBeobachter(KonkretesSubjekt subjekt) {
        aktuellerZaehlerstand = subjekt.getZaehler();
    }
    private void anzeige() {
        System.out.println("Aktueller Zaehlerstand = " + aktuellerZaehlerstand);
    }
}
