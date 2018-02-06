import java.util.*;
import java.lang.*;
import java.io.*;
class GFG{
    
    private static void moveRight(int row, int col, int [][] mat){
        for(int j=col;j<4-col;j++){
            System.out.print(mat[row][j] + " ");
        }
    }
    
    private static void moveDown(int row, int col, int [][] mat){
        for(int j=row;j<4-row+1;j++){
            System.out.print(mat[j][col] + " ");
        }
    }
    
    private static void moveLeft(int row, int col, int [][] mat){
        for(int j=col;j>4-col-3;j--){
            System.out.print(mat[row][j] + " ");
        }
    }
    
    private static void moveUp(int row, int col, int [][] mat){
        for(int j=row;j>4-row-2;j--){
            System.out.print(mat[j][col] + " ");
        }
    }
    
    
    
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    for(int c=0;c<t;c++){
	        int [][] mat = new int[4][4];
	        for(int i=0;i<4;i++){
	            for(int j=0;j<4;j++){
	                mat[i][j] = input.nextInt();
	            }
	        }
	        
	        for(int i=0;i<2;i++){
	            moveRight(i,i,mat);
	            moveDown(i+1,3-i,mat);
	            moveLeft(3-i,3-i-1,mat);
	            moveUp(3-i-1,i,mat);
	        }
	        System.out.println();
	    }
	}
}