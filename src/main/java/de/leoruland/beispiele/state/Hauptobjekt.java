package de.leoruland.beispiele.state;
/**
 * Das Hauptobjekt, dessen Zustaende geaendert werden
 */
public class Hauptobjekt {
    /**
     * Liefert den Zustand des Objektes zurueck
     * @return
     */
    public Zustand getAktuellerZustand() {
        return aktuellerZustand;
    }
    /**
     * Veraendert den Zustand des Objektes
     * @param aktuellerZustand
     */
    public void setAktuellerZustand(Zustand aktuellerZustand) {
        this.aktuellerZustand = aktuellerZustand;
    }
    /**
     * Der Zustand des Objektes
     */
    private Zustand aktuellerZustand;
    /**
     * Konstruktor des Hauptobjektes, setzt den Ursprungszustand
     */
    public Hauptobjekt() {
        this.aktuellerZustand = new ErsterZustand();
    }
    /**
     * Fuehrt eine Aktion aus, abhaengig vom aktuellen Zustand
     */
    public void aktion() {
        aktuellerZustand.aktion(this);
    }
}
