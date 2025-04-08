package Graphs;

public class SurrondedRegions {
    public static void main(String[] args) {
        char[][] grid = {
                { 'X', 'X', 'X', 'X' },
                { 'X', 'O', 'O', 'X' },
                { 'X', 'X', 'O', 'X' },
                { 'X', 'O', 'X', 'X' } };

        // go to boundary and use a temp charchater for now to replace 'o'
        // than make all the 'O' into 'X'
        // replace 'T' with 'O' again here is your output

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length;) {
                if (grid[i][j] == 'O')
                    floodfill(grid, i, j);

                if (i == 0 || i == grid.length - 1) {
                    j++;
                } else {
                    j += (grid[0].length - 1);
                }
            }
        }
        System.out.println("\nChange the BOundary\n");
        printMap(grid);
        System.out.println("\nChange all O to X \n");
        fillAll(grid);
        printMap(grid);
        // System.out.println("\nCOnvert T to O \n");
        // fillO(grid);
        // printMap(grid);

    }

    public static void floodfill(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] == 'T' || grid[i][j] == 'X')
            return;

        grid[i][j] = 'T';
        floodfill(grid, i, j - 1); // left
        floodfill(grid, i, j + 1); // right
        floodfill(grid, i - 1, j); // up
        floodfill(grid, i + 1, j); // down

    }

    static void fillAll(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 'T') {
                    grid[i][j] = 'X';
                }
                if (grid[i][j] == 'T') {
                    grid[i][j] = 'O';
                }
            }
        }
    }

    public static void printMap(char[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(" " + map[i][j]);
            }
            System.out.println();
        }
    }

    // Will not work as its pass by value at cell
    // static void fillAll(char[][] grid) {
    // for (char[] row : grid) {
    // for (char cell : row) {
    // if (cell != 'T') {
    // cell = 'X'; // <-- modifies only local 'cell', NOT the actual grid
    // }
    // }
    // }
    // }

}
