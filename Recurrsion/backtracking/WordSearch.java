package Recurrsion.backtracking;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {
                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };
        String word = "BACCED";
        System.out.println(exist(board, word)); // Output: true
    }

    public static boolean exist(char[][] board, String word) {
        int rows = board.length, cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (backtrack(board, word, 0, i, j, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean backtrack(char[][] board, String word, int index, int row, int col, boolean[][] visited) {
        if (index == word.length())
            return true; // Word found
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length
                || visited[row][col] || board[row][col] != word.charAt(index)) {
            return false; // Out of bounds or mismatch
        }

        visited[row][col] = true;

        // Explore all 4 directions
        boolean found = backtrack(board, word, index + 1, row + 1, col, visited) ||
                backtrack(board, word, index + 1, row - 1, col, visited) ||
                backtrack(board, word, index + 1, row, col + 1, visited) ||
                backtrack(board, word, index + 1, row, col - 1, visited);

        visited[row][col] = false; // Backtrack

        return found;
    }
}
