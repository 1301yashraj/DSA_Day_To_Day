package Graphs;

public class Enclave {
    public static void main(String[] args) {
        int[][] grid = {
                { 1, 1, 1, 1, 1, 1, 1 },
                { 1, 0, 0, 0, 0, 0, 1 },
                { 1, 0, 1, 1, 1, 0, 1 },
                { 1, 0, 1, 0, 1, 0, 1 },
                { 1, 0, 1, 1, 1, 0, 1 },
                { 1, 0, 0, 0, 0, 0, 1 },
                { 1, 1, 1, 1, 1, 1, 1 }
        };
        System.out.println("\nMap intially\n");
        printMap(grid);
        // now that we have the map we will first flood fill to remove all the 1s
        // touching the boundary and than we will couunt the no. of remaining ones

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length;) {
                if (grid[i][j] == 1)
                    floodfill(grid, i, j);

                if (i == 0 || i == grid.length - 1) {
                    j++;
                } else {
                    j += (grid[0].length - 1);
                }
            }
        }
        System.out.println("\nMap flood filled\n");
        printMap(grid);
        System.out.println("\nNo. of Enclaves >> " + countEnclaves(grid));
        // Now count all the cells or count 1s while printing

        // Now counting the number of closed Islands
        int closedIsland = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    closedIsland++;
                    floodfill(grid, i, j);
                }
            }
        }
        System.out.println("No. of Closed Islands " + closedIsland);
    }

    public static void floodfill(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] == 0)
            return;

        grid[i][j] = 0;
        floodfill(grid, i, j - 1); // left
        floodfill(grid, i, j + 1); // right
        floodfill(grid, i - 1, j); // up
        floodfill(grid, i + 1, j); // down

    }

    static int countEnclaves(int[][] grid) {
        int count = 0;
        for (int[] row : grid)
            for (int cell : row)
                if (cell == 1)
                    count++;
        return count;
    }

    public static void printMap(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(" " + map[i][j]);
            }
            System.out.println();
        }
    }
}