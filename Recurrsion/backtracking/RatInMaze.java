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
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(ans.toString());
            return;
        }
        if (row < 0 || col < 0 || row >= maze.length || col >= maze[0].length)
            return;

        if (maze[row][col] == 0 || visited[row][col])
            return;

        visited[row][col] = true;
        findPath(maze, row + 1, col, ans.append("D"), visited);
        ans.deleteCharAt(ans.length() - 1);

        findPath(maze, row, col + 1, ans.append("R"), visited);
        ans.deleteCharAt(ans.length() - 1);

        findPath(maze, row - 1, col, ans.append("U"), visited);
        ans.deleteCharAt(ans.length() - 1);

        findPath(maze, row, col - 1, ans.append("L"), visited);
        ans.deleteCharAt(ans.length() - 1);

        visited[row][col] = false;
    }
}
