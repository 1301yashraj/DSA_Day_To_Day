package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {
    public static void main(String[] args) {
        // Graph graph = new Graph(5, true);
        // graph.addEdge(0, 0);
        // here we dont make a graph instead each cell of the matrix is considered as a
        // node and its by default connected to its neghboring node
        // so here we will have a matrix which is not a mtrix representation of the
        // graph and is instead a kind of digramatical view of connected nodeS WHERE
        // each cell is bydefaultconnected to all its neighbour either in 4 directions
        // or 8 directions.

        int[][] image = {
                { 1, 1, 0, 0, 0 },
                { 1, 1, 0, 1, 1 },
                { 0, 0, 0, 1, 1 },
                { 0, 1, 1, 1, 0 },
                { 0, 0, 0, 0, 0 }
        };

        int startRow = 1, startColumn = 4; // Start position
        int newColor = 2, oldColor = image[startRow][startColumn];

        System.out.println("Before Flood Fill:");
        printMatrix(image);

        floodFillDFS(startRow, startColumn, image, newColor, oldColor);

        System.out.println("After Flood Fill:");
        printMatrix(image);

        reset(startRow, startColumn, image, newColor, oldColor);

        floodFillBFS(1, 1, image, newColor, oldColor);
        System.out.println("After Flood Fill:");
        printMatrix(image);
    }

    private static void floodFillBFS(int row, int column, int[][] matrix, int newValue, int oldValue) {
        if (oldValue == newValue)
            return; // Prevent infinite loop

        int[][] directions = new int[][] { { 0, -1 }/* left */,
                { 0, 1 }/* right */,
                { -1, 0 }/* up */,
                { 1, 0 }/* down */ };

        Queue<int[]> atPosition = new LinkedList<>();
        atPosition.add(new int[] { row, column });
        matrix[row][column] = newValue;

        while (!atPosition.isEmpty()) {
            int[] newPosition = atPosition.poll();
            row = newPosition[0];
            column = newPosition[1];
            for (int[] direction : directions) {
                // new place we are at
                int newRow = row + direction[0];
                int newCol = column + direction[1];
                if (newRow < 0 || newRow >= matrix.length || newCol < 0 || newCol >= matrix[0].length)
                    continue;

                // is its a value we are not concerened with return or already filled
                if (matrix[newRow][newCol] != oldValue || matrix[newRow][newCol] == newValue)
                    continue;

                matrix[newRow][newCol] = newValue;
                atPosition.add(new int[] { newRow, newCol });
            }
        }
    }

    private static void floodFillDFS(int row, int column, int[][] matrix, int newValue, int oldValue) {
        // if boundary return
        if (row < 0 || row >= matrix.length || column < 0 || column >= matrix[0].length)
            return;

        // is its a value we are not concerened with return or already filled
        if (matrix[row][column] != oldValue || matrix[row][column] == newValue)
            return;

        matrix[row][column] = newValue;
        // go up
        floodFillDFS(row - 1, column, matrix, newValue, oldValue);
        // go down
        floodFillDFS(row + 1, column, matrix, newValue, oldValue);
        // go left
        floodFillDFS(row, column - 1, matrix, newValue, oldValue);
        // go right
        floodFillDFS(row, column + 1, matrix, newValue, oldValue);

    }

    static void printMatrix(int[][] image) {
        for (int[] row : image) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }

    private static void reset(int row, int column, int[][] matrix, int newValue, int oldValue) {
        floodFillDFS(row, column, matrix, oldValue, newValue);
        System.out.println("Reset -----");
        printMatrix(matrix);
    }
}
