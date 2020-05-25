package de.leoruland.beispiele.observer;
/**
 * Das Observer Muster wird verwendet, wenn die Aenderungen in einem Objekt andere Klassen ebenfalls betreffen,
 * welche diese Aenderung integrieren muessen.
 * ZB ein Modell, das von einem oder mehreren Views angezeigt wird, wuerde die Aenderung evtl. per Observer Pattern mitteilen.
 *
 * Wichtig ist: Die Beobachter muessen nicht nur erstellt, sondern auch registriert werden. Ne.
 */
public class ObserverTesten {
    public  static void main(String[] args) {
        Subjekt subjekt = new SubjektModel();
        Beobachter beobachter = new BeobachterView(subjekt);
        subjekt.anmeldenBeobachter(beobachter);

        subjekt.zustandAendern();
        subjekt.zustandAendern();
        System.out.println("Jetzt kommt noch mal der gleiche Wert.");
        subjekt.benachrichtigen();

        subjekt.abmeldenBeobachter(beobachter);
        System.out.println("Jetzt kommt garnichts mehr.");
        subjekt.zustandAendern();
        subjekt.benachrichtigen();
    }
}
