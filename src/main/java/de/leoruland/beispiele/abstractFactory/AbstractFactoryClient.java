package de.leoruland.beispiele.abstractFactory;
/**
 * Das Abstract Factory Entwurfsmuster wird verwendet, wenn die zu erstellenden Klassen
 * in mehrere Familien eingeteilt werden koennen (zB Fauna und Flora der Wueste, der Eiswueste, der Aschewueste etc.)
 * Erst zur Laufzeit wird entschieden, welche Familie von Objekten gebildet wird (d.h. welche Konkrete Fabrik gewaehlt wird),
 * und welche Konkreten Produkte in der Auspraegung gemaess der Fabrik erstellt werden.
 */
public class AbstractFactoryClient {
    public static void main(String[] args) {
        AbstrakteFabrik fabrik1 = new KonkreteFabrik1();
        AbstraktesProduktA produktAvon1 = fabrik1.erzeugeProduktA();
        AbstraktesProduktB produktBvon1 = fabrik1.erzeugeProduktB();
        produktAvon1.aktion();
        produktBvon1.aktion();
        //
        AbstrakteFabrik fabrik2 = new KonkreteFabrik2();
        AbstraktesProduktA produktAvon2 = fabrik2.erzeugeProduktA();
        AbstraktesProduktB produktBvon2 = fabrik2.erzeugeProduktB();
        produktAvon2.aktion();
        produktBvon2.aktion();
    }
}
