import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junitpioneer.jupiter.params.ShortRangeSource;

import static org.junit.jupiter.api.Assertions.*;

public class NombresRomainsTest {
    @DisplayName(
            "ETANT DONNE un convertisseur de nombres romains " +
                    "QUAND on lui donne le nombre <nombreArabe> " +
                    "ALORS on obtient <nombreArabe> fois 'I'"
    )
    @ParameterizedTest
    @ShortRangeSource(from = 1, to = 3, closed = true)
    public void TestUnités(short nombreArabe) throws Exception {
        // ETANT DONNE un convertisseur de nombres romains
        // QUAND on lui donne le nombre <nombreArabe>
        var resultat =
                ConvertisseurNombresRomains
                        .Convertir(nombreArabe);

        // ALORS on obtient <nombreArabe> fois 'I'
        var attendu = "I".repeat(nombreArabe);
        assertEquals(attendu, resultat);
    }

    @Test
    @DisplayName(
            "ETANT DONNE un convertisseur de nombres romains " +
                    "QUAND on lui donne le nombre 4 " +
                    "ALORS on obtient 'IV'")
    public void Test4() throws Exception {
        // ETANT DONNE un convertisseur de nombres romains
        // QUAND on lui donne le nombre 4
        var resultat =
                ConvertisseurNombresRomains
                        .Convertir(4);

        // ALORS on obtient 'IV'
        assertEquals("IV", resultat);
    }

    @DisplayName(
            "ETANT DONNE un convertisseur de nombres romains " +
                    "QUAND on lui donne le nombre <nombreArabe> entre 5 et 8 " +
                    "ALORS on obtient 'V' plus <nombreArabe - 5> fois 'I'"
    )
    @ParameterizedTest
    @ShortRangeSource(from = 5, to = 8, closed = true)
    public void TestCinqPlusUnités(short nombreArabe) throws Exception {
        // ETANT DONNE un convertisseur de nombres romains
        // QUAND on lui donne le nombre <nombreArabe>
        var resultat =
                ConvertisseurNombresRomains
                        .Convertir(nombreArabe);

        // ALORS on obtient 'V' plus <nombreArabe - 5> fois 'I'
        var attendu = "V" + "I".repeat(nombreArabe - 5);
        assertEquals(attendu, resultat);
    }

    @Test
    @DisplayName(
            "ETANT DONNE un convertisseur de nombres romains " +
                    "QUAND on lui donne le nombre 9 " +
                    "ALORS on obtient 'IX'")
    public void Test9() throws Exception {
        // ETANT DONNE un convertisseur de nombres romains
        // QUAND on lui donne le nombre 9
        var resultat =
                ConvertisseurNombresRomains
                        .Convertir(9);

        // ALORS on obtient 'IX'
        assertEquals("IX", resultat);
    }

    @DisplayName(
            "ETANT DONNE un convertisseur de nombres romains " +
                    "QUAND on lui donne le nombre <nombreArabe> entre 10 et 13 " +
                    "ALORS on obtient 'X' plus <nombreArabe - 10> fois 'I'"
    )
    @ParameterizedTest
    @ShortRangeSource(from = 10, to = 13, closed = true)
    public void TestDixPlusUnités(short nombreArabe) throws Exception {
        // ETANT DONNE un convertisseur de nombres romains
        // QUAND on lui donne le nombre <nombreArabe>
        var resultat =
                ConvertisseurNombresRomains
                        .Convertir(nombreArabe);

        // ALORS on obtient 'X' plus <nombreArabe - 10> fois 'I'
        var attendu = "X" + "I".repeat(nombreArabe - 10);
        assertEquals(attendu, resultat);
    }
}
