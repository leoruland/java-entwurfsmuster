package de.leoruland.beispiele.decorator;
/**
 * Von dieser Klasse erben alle Erweiterungen des Objektes
 */
public abstract class ErweitertesSchiff extends Schiff {
    /**
     * Es braucht diese Eigenschaft,
     * hier wird das konkrete Schiff gespeichert, welches dekoriert wird
     */
    protected Schiff basis;
    /**
     * Konstruktor
     * @param basis ein konkretes, bzw bereits dekoriertes konkretes Schiff wird hier uebergeben
     */
    public ErweitertesSchiff(Schiff basis) {
        this.basis = basis;
    }
    /**
     * Setzt sich zwischen die bereits gestaltete Basis und den weiteren Dekorierer,
     * wenn der dekorierer die Methode seinerseits mit super statt basis aufruft
     * @return Das bisherige Schiff in poetische Worte gefasst, inklusive einem Woertchen der Vernunft
     */
    @Override
    public String toString() {
        return basis.toString() + " und";
    }
    /**
     * Muss existieren, wenn ein Dekorierer die Geschwindigkeit mit super statt mit basis aufruft
     * @see MitVerbessertemAntrieb
     * @return Die Geschwindigkeit des Schiffes, wieder
     */
    @Override
    public int getGeschwindigkeit() {
        return basis.getGeschwindigkeit();
    }
}
