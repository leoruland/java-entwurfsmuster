package de.leoruland.beispiele.factory;

public abstract class Fabrik {
    public Produkt produktAusliefern(String auswahl) {
        Produkt produkt = herstellen(auswahl);
        System.out.println(produkt.getName());
        return produkt;
    }
    protected abstract Produkt herstellen(String auswahl);
}
