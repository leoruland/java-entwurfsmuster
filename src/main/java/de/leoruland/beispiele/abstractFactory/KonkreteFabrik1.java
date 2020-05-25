package de.leoruland.beispiele.abstractFactory;

public class KonkreteFabrik1 extends AbstrakteFabrik {
    @Override
    AbstraktesProduktA erzeugeProduktA() {
        return new KonkretesProduktA1();
    }

    @Override
    AbstraktesProduktB erzeugeProduktB() {
        return new KonkretesProduktB1();
    }
}
