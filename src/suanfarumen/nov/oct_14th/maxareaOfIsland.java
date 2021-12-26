package suanfarumen.nov.oct_14th;

import java.util.LinkedList;
import java.util.Queue;

//整个矩阵由01组成  0为海水，1为陆地，找出由1相连组成的最大的那个陆地面积
public class maxareaOfIsland {
    static int[] dx = {1, 0, 0, -1};  //用偏移量的一种取巧手段
    static int[] dy = {0, 1, -1, 0};

    public static int maxAreaOfIsland(int[][] grid) {  //深度优先
        int ret=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j]==1){
                    int ladnarea=dfs(grid,i,j);
                    ret=Math.max(ret,ladnarea);
                }
            }
        }
        System.out.println("ret = " + ret);
        return ret;
    }



    public static int maxAreaOfIsland2(int[][] grid) {//广度优先
        int ret =0;
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                int cur=0;
                Queue<int[]> queue = new LinkedList<int []>();
                queue.offer(new int[] {i,j});
                while(!queue.isEmpty()) {
                    int cell[] = queue.poll();
                    int x = cell[0], y = cell[1];
                    if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] != 1) {
                        continue;
                    }
                    cur++;
                    grid[x][y] = 0;
                    for (int k = 0; k < 4; k++) {
                        queue.offer(new int[]{x+dx[k],y+dy[k]});
                    }
                }
                ret=Math.max(ret,cur);
            }
        }
        System.out.println("ret = " + ret);
        return ret;
    }


    public static int dfs(int [][] grid,int i,int j){
            if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]!=1){
                return 0;
            }

            grid[i][j]=0;
            int ret=1;
            ret+=dfs(grid, i+1, j);
            ret+=dfs(grid, i-1, j);
            ret+=dfs(grid, i, j+1);
            ret+=dfs(grid, i, j-1);
            return ret;
    }



    public static void main(String[] args) {
       int [][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
       maxAreaOfIsland2(grid);

    }
}
