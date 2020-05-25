package de.leoruland.beispiele.factory;
/**
 * Das Factory Entwurfsmuster wird verwendet,
 * wenn es verschiedene Objekte mit gleichen Methoden aber unterschiedlicher Implementierung dieser gibt
 * und erst zur Laufzeit entschieden werden soll, welches Objekt erstellt werden soll
 * (zB Automat mit diversen Aufgussgetraenken wie Gruener Tee, Weisser Tee, Sencha Tee etc.).
 */
public class FactoryTesten {
    public static void main(String[] args) {
        Fabrik fabrik = new FabrikKonkret();
        String auswahl1 = "Zauberbuch";
        fabrik.produktAusliefern(auswahl1);
        fabrik.produktAusliefern("Sachbuch");
    }
}
