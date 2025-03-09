package Recurrsion.backtracking;

public class RatInMaze {
    public static void main(String[] args) {
        int[][] maze = {
                { 1, 0, 0, 0, 0 },
                { 1, 1, 1, 1, 0 },
                { 0, 1, 0, 1, 0 },
                { 1, 1, 0, 1, 1 },
                { 0, 1, 1, 1, 1 }
        };
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        findPath(maze, 0, 0, new StringBuilder(), visited);
    }

    private static void findPath(int[][] maze, int row, int col, StringBuilder ans, boolean[][] visited) {
        // System.out.println("Row >>" + row + " col >> " + col);
        if (row >= 0 && col >= 0 && row < maze.length && col < maze[0].length) {
            if (row == maze.length - 1 && col == maze[0].length - 1)
                System.out.println(ans.toString());
        } else {

            return;
        }

        int atPoint = maze[row][col];
        if (atPoint == 0 || visited[row][col])
            return;

        visited[row][col] = true;
        // go down
        findPath(maze, row + 1, col, ans.append("D"), visited);
        ans.deleteCharAt(ans.length() - 1);
        // go right
        findPath(maze, row, col + 1, ans.append("R"), visited);
        ans.deleteCharAt(ans.length() - 1);
        // go up
        findPath(maze, row - 1, col, ans.append("U"), visited);
        ans.deleteCharAt(ans.length() - 1);
        // go left
        findPath(maze, row, col - 1, ans.append("L"), visited);
        ans.deleteCharAt(ans.length() - 1);

        visited[row][col] = false;
    }
}
