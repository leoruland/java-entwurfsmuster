package de.leoruland.beispiele.template;
/**
 * Das Template Entwurfsmuster wird verwendet, wenn ein Algorithmus auf verschiedene Objekte angewendet wird
 * und dabei immer die gleichen Schritte durchlaeuft, diese aber Objektabhaengig unterschiedlich implementiert sind.
 * Die Tierfuetterung laeuft zum Beispiel immer gleich ab,
 * nur kippt man dem Elefant Aepfel in die Schuessel und dem Pferd Karotten in den Korb und buerstet es vorher noch ein wenig.
 */
public class TemplateTest {
    public static void main(String[] args) {
        TemplateAlgorithmus freundliche = new Freundlich();
        TemplateAlgorithmus unfreundliche = new Unfreundlich();
        System.out.println("Computer hat gute Laune:");
        freundliche.steuermethode();
        System.out.println(System.lineSeparator());
        System.out.println("Computer hat schlechte Laune:");
        unfreundliche.steuermethode();
    }
}
