import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class CalculadoraTest {
    @Test
    public void testAdd() {
        Calculadora calculadora = new Calculadora();
        int result = calculadora.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSub() {
        Calculadora calculadora = new Calculadora();
        int result = calculadora.sub(5, 3);
        assertEquals(2, result);
    }
}