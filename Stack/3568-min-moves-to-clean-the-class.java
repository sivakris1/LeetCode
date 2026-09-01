import java.util.*;

class Solution {
    public int minMoves(String[] grid, int energy) {
        int m = grid.length;
        int n = grid[0].length();

        int startR = 0, startC = 0;
        List<int[]> litters = new ArrayList<>();

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                char ch = grid[r].charAt(c);
                if (ch == 'S') {
                    startR = r;
                    startC = c;
                } else if (ch == 'L') {
                    litters.add(new int[]{r, c});
                }
            }
        }

        int totalLitter = litters.size();
        int targetMask = (1 << totalLitter) - 1;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startR, startC, 0, energy, 0});

        int[][][] visited = new int[m][n][1 << totalLitter];
        for (int[][] row : visited) {
            for (int[] col : row) {
                Arrays.fill(col, -1);
            }
        }

        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];
            int mask = curr[2];
            int e = curr[3];
            int moves = curr[4];

            if (mask == targetMask) {
                return moves;
            }

            if (e <= visited[r][c][mask]) {
                continue;
            }
            visited[r][c][mask] = e;

            if (e == 0 && grid[r].charAt(c) != 'R') {
                continue;
            }

            for (int[] d : dirs) {
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr < 0 || nr >= m || nc < 0 || nc >= n || grid[nr].charAt(nc) == 'X') {
                    continue;
                }

                int nextEnergy = e - 1;
                if (nextEnergy < 0) continue;

                char cell = grid[nr].charAt(nc);

                if (cell == 'R') {
                    nextEnergy = energy;
                }

                int nextMask = mask;
                if (cell == 'L') {
                    for (int i = 0; i < totalLitter; i++) {
                        if (litters.get(i)[0] == nr && litters.get(i)[1] == nc) {
                            nextMask |= (1 << i);
                            break;
                        }
                    }
                }

                queue.add(new int[]{nr, nc, nextMask, nextEnergy, moves + 1});
            }
        }

        return -1;
    }
}
