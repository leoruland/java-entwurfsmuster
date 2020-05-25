package de.leoruland.beispiele.template;

public class Unfreundlich extends TemplateAlgorithmus {
    @Override
    protected void begruessung() {
        System.out.println("Hallo du Sau");
    }
    @Override
    protected void verabschiedung() {
        System.out.println("Hau ab");
    }
    @Override
    protected void hookOption() { System.out.println("Was"); }
}
