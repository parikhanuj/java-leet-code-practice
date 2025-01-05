import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WordSearchTest {

    @Test
    public void testWordExistsHorizontally() {
        WordSearch ws = new WordSearch();
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        assertTrue("The word 'ABCCED' should exist in the board.", ws.exist(board, "ABCCED"));
    }

    @Test
    public void testWordExistsVertically() {
        WordSearch ws = new WordSearch();
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        assertTrue("The word 'SEE' should exist in the board.", ws.exist(board, "SEE"));
    }

    @Test
    public void testWordDoesNotExist() {
        WordSearch ws = new WordSearch();
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        assertFalse("The word 'ABCB' should not exist in the board.", ws.exist(board, "ABCB"));
    }

    @Test
    public void testEmptyBoard() {
        WordSearch ws = new WordSearch();
        char[][] board = {};
        assertFalse("No word should exist in an empty board.", ws.exist(board, "ANY"));
    }

    @Test
    public void testEmptyWord() {
        WordSearch ws = new WordSearch();
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        assertTrue("An empty word should always exist.", ws.exist(board, ""));
    }

    @Test
    public void testSingleLetterWordExists() {
        WordSearch ws = new WordSearch();
        char[][] board = {
                {'A', 'B'},
                {'C', 'D'}
        };
        assertTrue("The single letter 'A' should exist in the board.", ws.exist(board, "A"));
    }

    @Test
    public void testSingleLetterWordDoesNotExist() {
        WordSearch ws = new WordSearch();
        char[][] board = {
                {'A', 'B'},
                {'C', 'D'}
        };
        assertFalse("The single letter 'E' should not exist in the board.", ws.exist(board, "E"));
    }
}
