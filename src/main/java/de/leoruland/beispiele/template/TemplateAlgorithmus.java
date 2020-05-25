package de.leoruland.beispiele.template;
/**
 * Abstrakte Klasse fuer einen Algorithmus, der so ungefaehr immer gleich bleibt
 * Nur die konkreten Formen haben einige Varianten
 *
 * Jede vewendete Methode ist bereits definiert und wird erst von den Konkreten Klassen bei Bedarf implementiert.
 */
public abstract class TemplateAlgorithmus {
    public void steuermethode() {
        begruessung();
        hookOption();
        hookAngebot();
        verabschiedung();
    }
    protected abstract void begruessung();
    protected abstract void verabschiedung();
    protected void hookOption() { };
    protected void hookAngebot() { System.out.println("Willst du"); }
}
