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
    
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = Integer.parseInt(input.nextLine());
	    
	    for(int c=0;c<t;c++){
	        String [] params = input.nextLine().trim().split(" ");
	        int n = Integer.parseInt(params[0]);
	        int m = Integer.parseInt(params[1]);
	        
	        int mat [][] = new int[n][m];
	        int dist [][] = new int[n][m];
	        
	        String [] temp = input.nextLine().trim().split(" ");
	        
	        int  k = 0;
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                mat[i][j] = Integer.parseInt(temp[k]);
	                dist[i][j] = Integer.MIN_VALUE;
	                k++;
	            }
	        }
	        
	        Queue<Cell> queue = new LinkedList<Cell>();
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                if(mat[i][j]==2){
	                    Cell cl = new Cell(i,j);
	                    queue.add(cl);
	                    dist[i][j] = 0;
	                }
	            }
	        }
	        
	        while(!queue.isEmpty()){
	            Cell cell = queue.poll();
	            //System.out.print(cell.i + " " + cell.j + " -- ");
	            int i = cell.i;
	            int j = cell.j;
	            
	            if(i+1<n && mat[i+1][j]==1 && dist[i+1][j]==Integer.MIN_VALUE){
	                Cell cl = new Cell(i+1,j);
	                dist[i+1][j] = dist[i][j] + 1;
	                mat[i+1][j] = 2;
	                //System.out.print((i+1) + " " + j + " , ");
	                queue.add(cl);
	            }
	            if(i-1>-1 && mat[i-1][j]==1 && dist[i-1][j]==Integer.MIN_VALUE){
	                Cell cl = new Cell(i-1,j);
	                dist[i-1][j] = dist[i][j] + 1;
	                mat[i-1][j] = 2;
	                //System.out.print((i-1) + " " + j + " , ");
	                queue.add(cl);
	            
	            }
	            
	            if(j-1>-1 && mat[i][j-1]==1 && dist[i][j-1]==Integer.MIN_VALUE){
	                Cell cl = new Cell(i,j-1);
	                dist[i][j-1] = dist[i][j] + 1;
	                mat[i][j-1] = 2;
	                //System.out.print((i) + " " + (j-1) + " , ");
	                queue.add(cl);
	            }
	            
	            if(j+1<m && mat[i][j+1]==1 && dist[i][j+1]==Integer.MIN_VALUE){
	                Cell cl = new Cell(i,j+1);
	                dist[i][j+1] = dist[i][j] + 1;
	                mat[i][j+1] = 2;
	                //System.out.print((i) + " " + (j+1) + " , ");
	                queue.add(cl);
	            }
	            //System.out.println();
	        }
	        
	        int max = 0;
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                if(mat[i][j]==1){
	                    max = -1;
	                    break;
	                }
	                max = Math.max(max,dist[i][j]);
	            }
	            if(max==-1){
	                break;
	            }
	        }
	        System.out.println(max);
	    }
	}
}