package de.leoruland.beispiele.state;
/**
 * Interface fuer alle Zustaende, die das Hauptobjekt einnehmen kann
 */
public interface Zustand {
    /**
     * Eine Methode, die eine Zustandsveraenderung bewirkt
     */
    void aktion(Hauptobjekt h);
}
