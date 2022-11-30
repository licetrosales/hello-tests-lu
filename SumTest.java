import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @org.junit.jupiter.api.Test
// "@Test“ = Annotation = Testmethode, d.h. sie testet eine Methode
    @Test
    void sum_should_return_correct_restul() {

        // GIVEN = Das was wir am Anfang haben
        int zahl1 = 5;
        int zahl2 = 7;
        int expected = zahl1 + zahl2; // 12

        // WHEN = Das was wir testen wollen, rufen wir hier auf
        int result = Sum.sum(zahl1, zahl2);

        // THEN = Das Erbegnis das wir erwarten
        // Assertions  = Sicherstellungen helfen uns Ergebnisse sicherzustellen (probar)
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    @Test
    void sum_should_not_return_incorrect_result() {

        // GIVEN = Das was wir am Anfang haben
        int zahl1 = 5;
        int zahl2 = 7;
        int expected = 13; // "AHHH" Computer sagt nein! (falsches Ergebnis)

        // WHEN = Das was wir testen wollen, rufen wir hier auf
        int result = Sum.sum(zahl1, zahl2);

        // THEN = Das Erbegnis das wir erwarten
        // Wir testen ob NICHT das falsche Ergebnis zurückgeliefert wird
        // (Nur zur  Demo, kein sinnvoller Test!)
       assertNotEquals(expected, result);
    }

}