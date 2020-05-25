package de.leoruland.beispiele.builder;
/**
 * Das Builder Entwurfsmuster soll die Erschaffung einer komplexen Klasse vereinfachen.
 */
public class BuilderTesten {
    public static void main(String[] args) {
        Baumhaus baumhaus = Baumhaus.builder()
                .aufBaum("Olive")
                .hatFenster(9)
                .mitLeiter(true)
                .build();
        System.out.println(baumhaus.toString());
    }
}
