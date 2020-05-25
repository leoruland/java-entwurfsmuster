package de.leoruland.beispiele;
/**
 * Das Singleton Entwurfsmuster wird dann eingesetzt, wenn es von einer Klasse exakt eine Instanz geben soll.
 * Beispiele waeren eine einzige Verbindung zur Datenbank, ein einziger Mailserver etc.
 *
 * Eigenschaften:
 * 1) Konstruktor ist privat
 * 2) Klasse hat eine static Eigenschaft ihrerselbst
 */
public final class Singleton {
    /**
     * Anzahl der gebildeten Instanzen
     */
    private int instances;
    /**
     * Getter der gebildeten Instanzen
     * @return Anzahl der gebildeten Instanzen
     */
    public int getInstances() {
        return instances;
    }
    /**
     * Einzige Instanz der Klasse
     */
    private static Singleton instance = new Singleton();
    /**
     * Getter der Instanz
     * @return Einzige Instanz der Klasse
     */
    public static Singleton getInstance() {
        return instance;
    }
    /**
     * Konstruktor der Klasse
     * private, damit keine weitere Instanz erstellt werden kann
     */
    private Singleton() {
        ++instances;
    }
}
