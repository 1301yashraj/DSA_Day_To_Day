package Graphs;

public class NoOfIsland {
    public static void main(String[] arhs) {
        int[][] map = {
                { 1, 1, 0, 0, 0 },
                { 1, 1, 0, 1, 1 },
                { 0, 0, 0, 1, 1 },
                { 0, 1, 1, 0, 0 },
                { 1, 1, 1, 0, 1 }
        };
        int[][] areaMap = {
                { 1, 1, 0, 0, 0 },
                { 1, 1, 0, 1, 1 },
                { 0, 0, 0, 1, 1 },
                { 0, 1, 1, 0, 0 },
                { 1, 1, 1, 0, 1 }
        };
        int island = 0;
        int area = 0;
        // so we have a map in which we have a
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                int atPoint = map[i][j];
                if (atPoint == 1) {
                    island++;
                    // do dsf to mark the island
                    dfs(map, i, j);
                    area = Math.max(area, dfsArea(areaMap, i, j, area));
                }
            }
        }

        System.out.println("No. of Islands >>> " + island);
        System.out.println("Max Area of Islands >>> " + area);
    }

    public static void dfs(int[][] map, int i, int j) {
        if (i < 0 || j < 0 || i == map.length || j == map[0].length || map[i][j] == 0)
            return;

        map[i][j] = 0;

        dfs(map, i, j - 1); // left
        dfs(map, i, j + 1); // right
        dfs(map, i - 1, j); // up
        dfs(map, i + 1, j); // down
    }

    public static int dfsArea(int[][] map, int i, int j, int area) {
        if (i < 0 || j < 0 || i == map.length || j == map[0].length || map[i][j] == 0)
            return 0;

        map[i][j] = 0;
        area = 1;

        area += dfsArea(map, i, j - 1, area);// left
        area += dfsArea(map, i, j + 1, area);// right
        area += dfsArea(map, i - 1, j, area);// up
        area += dfsArea(map, i + 1, j, area);// down

        return area;
    }

}
