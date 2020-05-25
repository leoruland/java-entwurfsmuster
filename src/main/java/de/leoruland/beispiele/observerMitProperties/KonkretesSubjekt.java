package de.leoruland.beispiele.observerMitProperties;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class KonkretesSubjekt {
    // Gehoert zum Entwurfsmuster
    private PropertyChangeSupport support = new PropertyChangeSupport(this);
    public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener) {
        support.addPropertyChangeListener(propertyChangeListener);
    }
    public void removePropertyChangeListener(PropertyChangeListener propertyChangeListener) {
        support.removePropertyChangeListener(propertyChangeListener);
    }
    // Gehoert zum Programm
    private int zaehler;
    public int getZaehler() {
        return zaehler;
    }
    public KonkretesSubjekt() {
        zaehler = 0;
    }
    public void zustandAendernZaehler() {
        support.firePropertyChange("zaehlerstand",zaehler,++zaehler);
    }
    public void zustandAenderWasAnderes() {
        support.firePropertyChange("anderes",666,777);
    }
}
