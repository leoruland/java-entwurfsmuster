package de.leoruland.beispiele.factory;

public class FabrikKonkret extends Fabrik {
    @Override
    protected Produkt herstellen(String auswahl) {
        Produkt p;
        switch (auswahl) {
            case "Kochbuch":
                p = new Kochbuch();
                break;
            case "Sachbuch":
                p = new Sachbuch();
                break;
            case "Zauberbuch":
                p = new Zauberbuch();
                break;
            default:
                return null;
        }
        return p;
    }
}
