package de.leoruland.beispiele.decorator;
/**
 * Ein konkret dekorierbares Schiff
 * Es ist ein Schlachtschiff
 */
public class Schlachtschiff extends Schiff {
    /**
     * Zeigt an, um was fuer ein Schiff es sich konkret handelt
     * @return Art des Schiffes
     */
    @Override
    public String toString() {
        return "Es ist ein Schlachtschiff";
    }
    /**
     * Gibt die Geschwindigkeit des Gefaehrtes an
     * @return Geschwinidgkeit in Yoloknoten
     */
    @Override
    public int getGeschwindigkeit() {
        return 100;
    }
}
