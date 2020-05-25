package de.leoruland.beispiele.state;
/**
 * Ein konkreter Zustand, den das Hauptobjekt einnehmen kann
 */
public class ZweiterZustand implements Zustand {
    /**
     * Aktion fuer den zweiten Zustand
     */
    @Override
    public void aktion(Hauptobjekt h) {
        System.out.println("Und her");
        h.setAktuellerZustand(new ErsterZustand());
    }
}
