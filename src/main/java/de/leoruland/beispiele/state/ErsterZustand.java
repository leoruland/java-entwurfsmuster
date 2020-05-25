package de.leoruland.beispiele.state;
/**
 * Ein konkreter Zustand, den das Hauptobjekt einnehmen kann
 */
public class ErsterZustand implements Zustand {
    /**
     * Aktion fuer den ersten Zustand
     */
    @Override
    public void aktion(Hauptobjekt h) {
        System.out.println("Hin");
        h.setAktuellerZustand(new ZweiterZustand());
    }
}
