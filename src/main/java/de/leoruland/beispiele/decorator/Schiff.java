package de.leoruland.beispiele.decorator;
/**
 * Eine abstrakte Klasse fuer ein dekorierbares Schiff
 */
public abstract class Schiff {
    /**
     * Eine Eigenschaft des Schiffes
     * @return Das Schiff in schoenen Worten
     */
    @Override
    public abstract String toString();
    /**
     * Eine weitere des Schiffes
     * @return Geschwindigkeit des Schiffes
     */
    public abstract int getGeschwindigkeit();
}
