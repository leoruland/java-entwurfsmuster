package de.leoruland.beispiele.abstractFactory;

public class KonkreteFabrik2 extends AbstrakteFabrik {
    @Override
    AbstraktesProduktA erzeugeProduktA() {
        return new KonkretesProduktA2();
    }

    @Override
    AbstraktesProduktB erzeugeProduktB() {
        return new KonkretesProduktB2();
    }
}
