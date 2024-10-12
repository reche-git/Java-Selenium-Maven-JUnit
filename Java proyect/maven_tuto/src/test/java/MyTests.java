import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyTests {

    @Test
    @DisplayName("Test esperando resultado")
    public void multiplicacionEsperandoResultadoNumro4() {
        Calculadora test = new Calculadora();
        assertEquals(4, test.multiplicacion(2, 2));
    }

    @Test
    @DisplayName("Test el resultado es True") // Se usa para reemplazar el nombre del método en consola
    public void ResultisNullOne() {
        Calculadora test = new Calculadora();
        assertFalse(test.isnull(test.multiplicacion(10, 5)));
    }

    @Test
    @DisplayName("Test el resultado es False")
    public void ResultisNullTwo() {
        Calculadora test = new Calculadora();
        assertTrue(test.isnull(test.multiplicacion(10, 0)));
    }
}
