import org.example.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicTacToeTest {

    @Test
    void testTie() {
        TicTacToe game = new TicTacToe();

        Assertions.assertEquals(2, game.getResult());
    }
}
