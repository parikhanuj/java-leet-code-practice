import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NoOfIslands {
    int ROWS;
    int COLUMNS;
    public int numIslands(char[][] grid) {
        ROWS = grid.length;
        COLUMNS = grid[0].length;
        int count = 0;

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    bfs(grid, i, j);
                }
            }
        }
        return count;
    }

    private void bfs(char[][] grid, int r, int c) {
        List<int[]> DIRECTIONS = Arrays.asList(
                new int[]{1, 0},
                new int[]{0, 1},
                new int[]{-1, 0},
                new int[]{0, -1}
        );
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{r, c});
        while (!q.isEmpty()) {
            int[] current = q.poll();
            for (int[] direction: DIRECTIONS) {
                int nextRow = current[0] + direction[0];
                int nextCol = current[1] + direction[1];

                if (nextRow < ROWS && nextRow >= 0 && nextCol < COLUMNS && nextCol >= 0 && grid[nextRow][nextCol] == '1') {
                    grid[nextRow][nextCol] = '0';
                    q.offer(new int[]{nextRow, nextCol});
                }
            }
        }
    }
}
