package de.leoruland.beispiele;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SingletonTest {
    Singleton instanceA;
    Singleton instanceB;
    @BeforeEach
    void setup() {
        instanceA = Singleton.getInstance();
        instanceB = Singleton.getInstance();
    }
    @Test
    void instanceIsSingular() {
        Assertions.assertEquals(1,instanceA.getInstances());
        Assertions.assertEquals(1,instanceB.getInstances());
    }
    @Test
    void instancesAreSame() {
        Assertions.assertEquals(instanceA.hashCode(),instanceB.hashCode());
    }
}