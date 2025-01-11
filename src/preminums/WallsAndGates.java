// https://leetcode.com/problems/walls-and-gates/description/
package preminums;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WallsAndGates {
    int INFINITY = Integer.MAX_VALUE;
    int ROWS;
    int COLUMNS;
    int GATE = 0;
    private static final List<int[]> DIRECTIONS = Arrays.asList(
            new int[] { 1, 0 },
            new int[] { -1, 0 },
            new int[] { 0, 1 },
            new int[] { 0, -1 });

    public void wallsAndGates(int[][] rooms) {
        ROWS = rooms.length;
        COLUMNS = rooms[0].length;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (rooms[i][j] == GATE)
                    queue.offer(new int[] { i, j });
            }
        }
        int currentStep = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int k = 0; k < size; k++) {
                int[] coordinates = queue.poll();
                int currentRow = coordinates[0];
                int currentCol = coordinates[1];
                for (int[] direction : DIRECTIONS) {
                    int r = currentRow + direction[0];
                    int c = currentCol + direction[1];
                    if (r < 0 || c < 0 || r >= ROWS || c >= COLUMNS || rooms[r][c] != INFINITY) {
                        continue;
                    }
                    rooms[r][c] = currentStep;
                    queue.add(new int[] { r, c });
                }
            }
            currentStep++;
        }
    }
}
