package de.leoruland.beispiele.builder;

import javax.annotation.processing.Generated;

public class Baumhaus {

    private String baum;
    public String getBaum() {
        return baum;
    }

    private int fenster;
    public int getFenster() {
        return fenster;
    }

    private boolean leiter;
    public boolean isLeiter() {
        return leiter;
    }

    @Generated("SparkTools")
    private Baumhaus (Builder builder) {
        this.baum = builder.baum;
        this.fenster = builder.fenster;
        this.leiter = builder.leiter;
    }

    public Baumhaus() {}

    @Override
    public String toString() {
        String leiter = "eine";
        if (!this.leiter)
            leiter = "keine";
        return "Das Baumhaus hat " + this.getFenster() + " Fenster und steht auf einer " + this.getBaum() + ". Es besitzt " + leiter + " Leiter.";
    }

    /**
     * Erschafft einen Builder, um ein {@link Baumhaus} zusammenzubauen.
     * @return erschaffender Builder
     */
    @Generated("SparkTools")
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder Klasse fuer {@link Baumhaus}.
     */
    @Generated("SparkTools")
    public static final class Builder {
        private String baum;
        private int fenster;
        private boolean leiter;

        private Builder() {}

        public Builder aufBaum(String baum) {
            this.baum = baum;
            return this;
        }

        public Builder hatFenster(int fenster) {
            this.fenster = fenster;
            return this;
        }

        public Builder mitLeiter(boolean leiter) {
            this.leiter = leiter;
            return this;
        }

        public Baumhaus build() {
            return new Baumhaus(this);
        }
    }
}
