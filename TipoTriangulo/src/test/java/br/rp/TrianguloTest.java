package br.rp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.rp.TipoTriangulo;
import org.rp.Triagulo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TrianguloTest {

    @Test
    @Order(1)
    @DisplayName("Teste de triangulo equilatero")
    void testEquilatero(){
        final Triagulo triagulo = new Triagulo(2D, 2D, 2D);
        assertEquals(TipoTriangulo.EQUILATERO, triagulo.getClassificacao());
    }

    @Test
    @Order(2)
    @DisplayName("Teste de triangulo isoceles")
    void testIsoceles(){
        final Triagulo triagulo = new Triagulo(2D, 2D, 1D);
        assertEquals(TipoTriangulo.ISOCELES, triagulo.getClassificacao());
    }

    @Test
    @Order(3)
    @DisplayName("Teste de triangulo escaleno")
    void testEscaleno(){
        final Triagulo triagulo = new Triagulo(5D, 7D, 8D);
        assertEquals(TipoTriangulo.ESCALENO, triagulo.getClassificacao());
    }

    @Test
    @Order(4)
    @DisplayName("Teste de triangulo invalido")
    void testInvalido(){
        final Triagulo triagulo = new Triagulo(2D, 2D, 5D);
        RuntimeException aThrows = assertThrows(RuntimeException.class, triagulo::getClassificacao);
        assertEquals("Não é um triangulo", aThrows.getMessage());
    }

}
