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
        System.out.println("----------------------");

        int[][] maze2 = {
                { 1, 1, 0, 1, 1 },
                { 1, 0, 1, 1, 0 },
                { 1, 1, 1, 0, 1 },
                { 0, 1, 0, 1, 1 },
                { 1, 1, 1, 1, 1 }
        };
        boolean[][] visited2 = new boolean[maze2.length][maze2[0].length];
        findPath(maze2, 0, 0, new StringBuilder(), visited2);
        System.out.println("----------------------");

        int[][] maze3 = {
                { 1, 1, 1, 1 },
                { 0, 0, 0, 1 },
                { 0, 0, 0, 1 },
                { 1, 1, 1, 1 }
        };
        boolean[][] visited3 = new boolean[maze3.length][maze3[0].length];
        findPath(maze3, 0, 0, new StringBuilder(), visited3);
        System.out.println("----------------------");
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
