package de.leoruland.beispiele.decorator;
/**
 * Ein Dekorierer fuer eine konkrete Klasse der abstrakten Klasse Schiff
 * Es hat nun einen verbesserten Antrieb
 */
public class MitVerbessertemAntrieb extends ErweitertesSchiff {
    /**
     * Konstruktor
     * @param basis ein konkretes, bzw bereits dekoriertes konkretes Schiff wird hier uebergeben
     */
    public MitVerbessertemAntrieb(Schiff basis) {
        super(basis);
    }
    /**
     * Setzt die neue Eigenschaft ans Ende der bisherigen Beschreibung des Schiffes
     * @return Das bisherige Schiff in poetische Worte gefasst, inklusive dem neuen Dekorierer angehaengt
     */
    @Override
    public String toString() {
        return super.toString() + " es ist schnell";
    }
    /**
     * Passt die Geschwindigkeit des Schiffes an
     * @return Neue Geschwindigkeit des Schiffes
     */
    @Override
    public int getGeschwindigkeit() {
        return super.getGeschwindigkeit()+500;
    }
}
