import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BaralhoTest {

    @Test
    public void testCriacaoBaralho() {
        Baralho baralho = new Baralho();

        // Verifica se o número de cartas criadas é igual a 52
        assertEquals(52, baralho.numeroDeCartas());
    }

    @Test
    public void testBaralhoVazio() {
        Baralho baralho = new Baralho();

        // Remove todas as cartas do baralho
        while (baralho.numeroDeCartas() > 0) {
            baralho.pegaCarta();
        }

        // Verifica se o baralho está vazio
        assertEquals(0, baralho.numeroDeCartas());
        assertNull(baralho.pegaCarta());
    }

    @Test
    public void testBaralhoBaralhado() {
        Baralho baralho = new Baralho();
        Baralho baralhoOriginal = new Baralho();

        // Baralha o baralho
        baralho.baralhar();

        // Verifica se o baralho está em ordem diferente do baralho original
        assertNotEquals(baralhoOriginal.iterator().next(), baralho.iterator().next());
    }

    @Test
    public void testPegaCarta() {
        Baralho baralho = new Baralho();
        int numeroDeCartas = baralho.numeroDeCartas();

        // Pega uma carta do baralho
        Carta carta = baralho.pegaCarta();

        // Verifica se a carta foi removida do baralho
        assertEquals(numeroDeCartas - 1, baralho.numeroDeCartas());

        // Verifica se a carta retornada não é nula
        assertNotNull(carta);
    }
}
