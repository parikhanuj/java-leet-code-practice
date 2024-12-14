import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> rowSet = new HashSet<>();
            Set<Character> columnSet = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                if ((board[i][j] != '.' && rowSet.contains(board[i][j])) ||
                        board[j][i] != '.' && columnSet.contains(board[j][i])) {
                    return false;
                }
                if (board[i][j] != '.') rowSet.add(board[i][j]);
                if (board[j][i] != '.') columnSet.add(board[j][i]);
            }
        }
        for (int i = 0; i < 9; i++) {
            Set<Character> boxSet = new HashSet<>();
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (board[((i / 3) * 3) + j][((i % 3) * 3) + k] != '.' && boxSet.contains(board[((i / 3) * 3) + j][((i % 3) * 3) + k])) {
                        return false;
                    }
                    if (board[((i / 3) * 3) + j][((i % 3) * 3) + k] != '.') boxSet.add(board[((i / 3) * 3) + j][((i % 3) * 3) + k]);
                }
            }
        }
        return true;
    }
}
