import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartaTest {

    @Test
    public void testMenorValor() {
        int menorValorEsperado = Carta.AS; // Valor do Ás

        int menorValorObtido = Carta.menorValor();

        assertEquals(menorValorEsperado, menorValorObtido);
    }

    @Test
    public void testMaiorValor() {
        int maiorValorEsperado = Carta.REI; // Valor do Rei

        int maiorValorObtido = Carta.maiorValor();

        assertEquals(maiorValorEsperado, maiorValorObtido);
    }
}
