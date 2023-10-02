import org.example.Aluno;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {
    private Aluno aluno;

    @BeforeEach
    public void setUp() {
        // Configuração inicial para cada teste
        double[] notas = {8.0, 7.0, 6.0};
        double[] pesos = {0.3, 0.3, 0.4};
        aluno = new Aluno("João", notas, pesos);
    }

    @Test
    public void testCalcularMedia() {
        double media = aluno.calcularMedia();
        assertEquals(6.9, media, 0.01);
    }


    @Test
    public void testPassou() {
        assertTrue(aluno.passou());
    }

    @Test
    public void testSituacaoAprovado() {
        String situacao = aluno.situacao();
        assertEquals("Aprovado", situacao);
    }

    @Test
    public void testSituacaoReprovado() {
        aluno = new Aluno("Maria", new double[]{4.0, 3.0, 2.0}, new double[]{0.3, 0.3, 0.4});
        String situacao = aluno.situacao();
        assertEquals("Reprovado", situacao);
    }

    @Test
    public void testSituacaoComMediaBorderline() {
        aluno = new Aluno("Carlos", new double[]{5.0, 5.0, 5.0}, new double[]{0.3, 0.3, 0.4});
        String situacao = aluno.situacao();
        assertEquals("Aprovado", situacao);
    }
}