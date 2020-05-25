package de.leoruland.beispiele.decorator;
/**
 * Ein konkret dekorierbares Schiff
 * Es ist ein Raumschiff
 */
public class Raumschiff extends Schiff {
    /**
     * Zeigt an, um was fuer ein Schiff es sich konkret handelt
     * @return Art des Schiffes
     */
    @Override
    public String toString() {
        return "Es ist ein Raumschiff";
    }
    /**
     * Gibt die Geschwindigkeit des Raumschiffes an
     * @return Geschwindigkeit in Holoknoten
     */
    @Override
    public int getGeschwindigkeit() {
        return 1000;
    }
}
