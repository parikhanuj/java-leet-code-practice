public class WordSearch {

    public boolean exist(char[][] board, String word) {
        boolean[][] used = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (backtrack(board, i, j, 0, word, used)) return true;
            }
        }
        return false;
    }

    private boolean backtrack(char[][] board, int x, int y, int i, String target, boolean[][] used) {
        if (i == target.length()) {
            return true;
        }

        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length || board[x][y] != target.charAt(i) || used[x][y]) {
            return false;
        }

        used[x][y] = true;
        boolean result = backtrack(board, x, y + 1, i + 1, target, used) ||
                backtrack(board, x, y - 1, i + 1, target, used) ||
                backtrack(board, x + 1, y, i + 1, target, used) ||
                backtrack(board, x - 1, y, i + 1, target, used);
        used[x][y] = false;

        return result;
    }
}
