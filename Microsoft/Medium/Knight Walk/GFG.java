import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static class Cell{
        int i;
        int j;
        
        public Cell(int i, int j){
            this.i = i;
            this.j = j;
        }
    }
    
    private static void bfs(int [][] mat, int s1, int s2, int d1, int d2){
        mat[s1][s2] =0;
        Cell temp = new Cell(s1,s2);
        Queue<Cell> queue = new LinkedList<Cell>();
        queue.add(temp);
        
        while(!queue.isEmpty()){
            temp = queue.poll();
            int i = temp.i;
            int j = temp.j;
            if(i==d1 && j==d2){
                break;
            }
            
            if(j-1>-1){
                if(i+2<mat.length && mat[i+2][j-1]==-1){
                    Cell cell = new Cell(i+2,j-1);
                    mat[i+2][j-1] = mat[i][j]+1;
                    queue.add(cell);
                }
                if(i-2>-1 && mat[i-2][j-1]==-1){
                    Cell cell = new Cell(i-2,j-1);
                    mat[i-2][j-1] = mat[i][j]+1;
                    queue.add(cell);
                }
            }
            if(j+1<mat[0].length){
                if(i+2<mat.length && mat[i+2][j+1]==-1){
                    Cell cell = new Cell(i+2,j+1);
                    mat[i+2][j+1] = mat[i][j]+1;
                    queue.add(cell);
                }
                if(i-2>-1 && mat[i-2][j+1]==-1){
                    Cell cell = new Cell(i-2,j+1);
                    mat[i-2][j+1] = mat[i][j]+1;
                    queue.add(cell);
                }
            }
            
            if(i-1>-1){
                if(j+2<mat[0].length && mat[i-1][j+2]==-1){
                    Cell cell = new Cell(i-1,j+2);
                    mat[i-1][j+2] = mat[i][j]+1;
                    queue.add(cell);
                }
                if(j-2>-1 && mat[i-1][j-2]==-1){
                    Cell cell = new Cell(i-1,j-2);
                    mat[i-1][j-2] = mat[i][j]+1;
                    queue.add(cell);
                }
            }
            if(i+1<mat.length){
                if(j+2<mat[0].length && mat[i+1][j+2]==-1){
                    Cell cell = new Cell(i+1,j+2);
                    mat[i+1][j+2] = mat[i][j]+1;
                    queue.add(cell);
                }
                if(j-2>-1 && mat[i+1][j-2]==-1){
                    Cell cell = new Cell(i+1,j-2);
                    mat[i+1][j-2] = mat[i][j]+1;
                    queue.add(cell);
                }
            }
        }
    }
    
	public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int t = Integer.parseInt(input.nextLine());
        
        for(int c=0;c<t;c++){
            String [] params = input.nextLine().trim().split(" ");
            int n = Integer.parseInt(params[0]);
            int m = Integer.parseInt(params[1]);
            
            int [][] mat = new int[n][m];
            
            String [] indexes = input.nextLine().trim().split(" ");
            int s1 = Integer.parseInt(indexes[0])-1;
            int s2 = Integer.parseInt(indexes[1])-1;
            int d1 = Integer.parseInt(indexes[2])-1;
            int d2 = Integer.parseInt(indexes[3])-1;
            
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    mat[i][j] = -1;
                }
            }
            
            mat[s1][s2] = 0;
            
            bfs(mat,s1,s2,d1,d2);
            System.out.println(mat[d1][d2]);
        }
    }
}