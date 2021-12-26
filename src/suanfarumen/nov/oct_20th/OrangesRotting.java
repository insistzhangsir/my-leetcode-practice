package suanfarumen.nov.oct_20th;
//在给定的网格中，每个单元格可以有以下三个值之一：
//
//        值 0 代表空单元格；
//        值 1 代表新鲜橘子；
//        值 2 代表腐烂的橘子。
//        每分钟，任何与腐烂的橘子（在 4 个正方向上）相邻的新鲜橘子都会腐烂。
//
//        返回直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1。

import java.util.LinkedList;
import java.util.Queue;

public class OrangesRotting {

    static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static int orangesRotting(int[][] grid) {
        Queue <int []> queue=new LinkedList<int []>();
        int freshorange=0;
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                if(grid[i][j]==1){
                    freshorange++;
                }
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }
            }
        }
        int round=0;
        while(freshorange>0&&!queue.isEmpty()){
            round++;
            int size=queue.size();
            for (int i = 0; i < size; i++) {
                int cell[]=queue.poll();
                int x=cell[0],y=cell[1];
                if(x+1<=grid.length-1&&grid[x+1][y]==1){
                    grid[x+1][y]=2;
                    freshorange--;
                    queue.offer(new int[]{x+1,y});
                }
                if(y+1<=grid[0].length-1&&grid[x][y+1]==1){
                    grid[x][y+1]=2;
                    freshorange--;
                    queue.offer(new int[]{x,y+1});
                }
                if(x-1>=0&&grid[x-1][y]==1){
                    grid[x-1][y]=2;
                    freshorange--;
                    queue.offer(new int[]{x-1,y});
                }
                if(y-1>=0&&grid[x][y-1]==1){
                    grid[x][y-1]=2;
                    freshorange--;
                    queue.offer(new int[]{x,y-1});
                }
            }
        }
        if(freshorange>0){
            return -1;
        }
        return round;
    }





    public static void main(String[] args) {
        int grid[][]={{2,1,1},{1,1,0},{0,1,1}};
//        orangesRotting(grid);
        System.out.println(orangesRotting(grid));

    }
}
