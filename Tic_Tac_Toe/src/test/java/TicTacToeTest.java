import org.example.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicTacToeTest {

    @Test
    void testTie() {
        TicTacToe game = new TicTacToe();

        Assertions.assertEquals(2, game.getResult());
    }

    @Test
    void testDraw() {
        var board = new Board();
        board.setPosition(new int[]{0, 0}, 1);
        board.setPosition(new int[]{0, 2}, 2);
        board.setPosition(new int[]{1, 0}, 2);
        board.setPosition(new int[]{1, 1}, 1);
        board.setPosition(new int[]{1, 2}, 1);
        board.setPosition(new int[]{2, 0}, 1);
        board.setPosition(new int[]{2, 2}, 2);

        Assertions.assertTrue(board.checkDraw());
    }
}
