package de.leoruland.beispiele.observer;

import java.util.List;

public interface Subjekt {
    List<Beobachter> getBeobachterListe();
    void anmeldenBeobachter(Beobachter beobachter);
    void abmeldenBeobachter(Beobachter beobachter);
    /**
     * Ruft in allen Beobachtern die Methode aktualisieren() auf.
     */
    void benachrichtigen();
    /**
     * Aendert den Zustand des Objekts und ruft schliesslich benachrichtigen() auf,
     * um alle registrierten Beobachter zu informieren, dass nun etwas geaendert worden ist.
     */
    void zustandAendern();
}
