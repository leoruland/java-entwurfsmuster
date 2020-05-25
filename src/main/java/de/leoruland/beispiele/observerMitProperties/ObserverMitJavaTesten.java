package de.leoruland.beispiele.observerMitProperties;
/**
 * Das Observer Muster wird verwendet, wenn die Aenderungen in einem Objekt andere Klassen ebenfalls betreffen,
 * welche diese Aenderung integrieren muessen.
 * ZB ein Modell, das von einem oder mehreren Views angezeigt wird, wuerde die Aenderung evtl. per Observer Pattern mitteilen.
 *
 * Das Anmelden eines Beobachters erfolgt ueber das hinzufuegen eines Listeners beim zu beobachtenden Subjekt.
 */
public class ObserverMitJavaTesten {
    public static void main (String[] args) {
        KonkretesSubjekt subjekt = new KonkretesSubjekt();
        KonkreterBeobachter beobachter = new KonkreterBeobachter(subjekt);
        subjekt.addPropertyChangeListener(beobachter);

        subjekt.zustandAendernZaehler();
        subjekt.zustandAendernZaehler();
        subjekt.zustandAenderWasAnderes();
        subjekt.removePropertyChangeListener(beobachter);
        System.out.println("Und Schluss");
        subjekt.zustandAendernZaehler();
    }
}
