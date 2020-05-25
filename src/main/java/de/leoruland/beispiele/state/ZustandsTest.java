package de.leoruland.beispiele.state;
/**
 * Das State Entwurfsmodell wird angewendet, wenn die Implementierung der Methodenaufrufe einer Klasse
 * zustandsabhaengig unterschiedlich sind.
 *
 * Jeder Zustand wird dabei durch eine eigene Zustandsklasse repraesentiert, welche die betreffenden Methoden
 * jeweils unterschiedlich umsetzt.
 *
 * 1) Jeder Zustand hat eine eigene Klasse -> gemeinsames Interface
 * 2) Das Hauptaktionsobjekt besitzt eine Eigenschaft vom Typ Zustand ("aktuellerZustand")
 * 3) Um den Zustand des Objektes innerhalb der Zustandsklassen aendern zu koennen, muss die Instanz des Hauptobjektes
 * an die Zustandsklassen uebergeben werden.
 *
 * Fuer Implementierung von Standardverhalten in allen Zustaenden ist evtl. eine Abstrakte Klasse statt einem Interface noetig
 */
public class ZustandsTest {
    /**
     * Hauptablaufmethode
     * @param args
     */
    public static void main(String[] args) {
        Hauptobjekt dings = new Hauptobjekt();
        dings.aktion();
        dings.aktion();
        dings.aktion();
        dings.aktion();
    }
}
