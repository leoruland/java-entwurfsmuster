package de.leoruland.beispiele.decorator;
/**
 * Das Decorator Entwurfsmuster wird verwendet, wenn das Objekt zur Laufzeit neue Funktionalitaeten (Methoden)
 * dazugewinnen soll. Beispiele sind Input/Output Streams.
 *
 * 1) Basis bildet eine abstrakte Basisklasse des Hauptobjektes, von der ..
 * 2) .. konkrete Basismodule erben
 * 3) .. eine weitere abstrakte Erweiterungsklasse abgeleitet ist,
 * die eine Eigenschaft vom Typ der Basisklasse hat, welche erweitert werden soll.
 * 4) Von der abstrakten Erweiterungsklasse erben dann wiederum konkrete Module, die Dekorierer
 *
 * Die Dekorierer verwenden ihre Eigenschaft vom Typ Basisklasse, um diese zu Erweitern
 */
public class DecoratorTest {
    /**
     * Die Hauptmethode, dekoriert verschiedene Schiffe
     * @param args
     */
    public static void main(String[] args) {
        Schiff firefly = new MitVerbessertemAntrieb(new MitVerbessertemAntrieb(new Raumschiff()));
        System.out.println(firefly.toString());
        System.out.println("Geschwindigkeit:" + firefly.getGeschwindigkeit());
        Schiff blackPearl = new MitVerbessertemAntrieb(new MitKanonen(new Schlachtschiff()));
        System.out.println(blackPearl.toString());
        System.out.println("Geschwindigkeit:" + blackPearl.getGeschwindigkeit());
    }
}
