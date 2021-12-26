package suanfarumen.nov.oct_13th;
//图像渲染  用一个新的颜色来传染其他颜色   从一个点开始向上下左右蔓延，只要与这个点颜色相同，就全部染为相同颜色
import java.util.LinkedList;
import java.util.Queue;

public  class FloodFill {
    static int[] dx = {1, 0, 0, -1};  //用偏移量的一种取巧手段
    static int[] dy = {0, 1, -1, 0};

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) { //深度优先
        dfs(image, sr, sc,newColor,image[sr][sc]);
        return image;
    }

    public static int[][] floodFill2(int[][] image, int sr, int sc, int newColor) { //广度优先
        int currColor = image[sr][sc];
        if (currColor == newColor) {
            return image;
        }
        int n = image.length, m = image[0].length;
        Queue<int[]> queue = new LinkedList<int[]>();
        queue.offer(new int[]{sr, sc});
        image[sr][sc] = newColor;
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];
            for (int i = 0; i < 4; i++) {
                int mx = x + dx[i], my = y + dy[i];
                if (mx >= 0 && mx < n && my >= 0 && my < m && image[mx][my] == currColor) {
                    queue.offer(new int[]{mx, my});
                    image[mx][my] = newColor;
                }
            }
        }
        return image;
    }


    static void dfs(int [][]image,int sr,int sc,int newcolor ,int oldcolor){
            if(sr<0||sc<0||sr>=image.length||sc>=image[0].length||newcolor==oldcolor||image[sr][sc]!=oldcolor) {
                return ;
            }
            image[sr][sc]=newcolor;
            dfs(image, sr-1, sc,newcolor,oldcolor);
            dfs(image, sr+1, sc,newcolor,oldcolor);
            dfs(image, sr, sc-1,newcolor,oldcolor);
            dfs(image, sr, sc+1,newcolor,oldcolor);

    }


    public static void main(String[] args) {
        int image[][]={{1,1,1},{1,1,0},{1,0,1}};
        floodFill2(image,1,1,2);
        for (int i = 0; i <image.length ; i++) {
            for (int j = 0; j <image[i].length ; j++) {
                System.out.print(image[i][j]+" ");
            }
            System.out.println();
        }
    }
}
