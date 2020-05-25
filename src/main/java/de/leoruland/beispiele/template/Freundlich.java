package de.leoruland.beispiele.template;
public class Freundlich extends TemplateAlgorithmus {
    @Override
    protected void begruessung() {
        System.out.println("Hallo lieber Benutzer");
    }
    @Override
    protected void verabschiedung() {
        System.out.println("Einen schoenen Tag");
    }
    @Override
    protected void hookAngebot() {
       System.out.println("Moechtest du Kaffee oder lieber einen Cafe?");
    }
}
