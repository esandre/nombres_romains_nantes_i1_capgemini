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
        assertEquals("I".repeat(nombreArabe), resultat);
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

    @Test
    @DisplayName(
            "ETANT DONNE un convertisseur de nombres romains " +
            "QUAND on lui donne le nombre 5 " +
            "ALORS on obtient 'V'")
    public void Test5() throws Exception {
        // ETANT DONNE un convertisseur de nombres romains
        // QUAND on lui donne le nombre 5
        var resultat =
                ConvertisseurNombresRomains
                        .Convertir(4);

        // ALORS on obtient 'V'
        assertEquals("V", resultat);
    }
}
