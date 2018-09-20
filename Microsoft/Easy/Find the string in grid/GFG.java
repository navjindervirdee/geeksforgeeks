import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    private static boolean up(char [][] grid, int i, int j, char [] pattern){
        if(i+1<pattern.length){
            return false;
        }
        int k = 0;
        for(int l=i;l>i-pattern.length;l--){
            if(grid[l][j]!=pattern[k]){
                return false;
            }
            k++;
        }
        return true;
    }
    
    private static boolean down(char [][] grid, int i, int j, char [] pattern){
        if(grid.length-i<pattern.length){
            return false;
        }
        int k = 0;
        for(int l=i;l<i+pattern.length;l++){
            if(grid[l][j]!=pattern[k]){
                return false;
            }
            k++;
        }
        return true;
    }
    
    private static boolean left(char [][] grid, int i, int j, char [] pattern){
        if(j+1<pattern.length){
            return false;
        }
        int k = 0;
        for(int l=j;l>j-pattern.length;l--){
            if(grid[i][l]!=pattern[k]){
                return false;
            }
            k++;
        }
        return true;
    }
    
    private static boolean right(char [][] grid, int i, int j, char [] pattern){
        if(grid[0].length-j<pattern.length){
            return false;
        }
        int k = 0;
        for(int l=j;l<j+pattern.length;l++){
            if(grid[i][l]!=pattern[k]){
                return false;
            }
            k++;
        }
        return true;
    }
    
    private static boolean upRight(char [][] grid, int i, int j, char [] pattern){
        int k = 0;
        int l = i;
        int m = j;
        while(l>-1 && m<grid[0].length && k<pattern.length){
            if(grid[l][m]!=pattern[k]){
                return false;
            }
            k++;
            l--;
            m++;
        }
        if(k!=pattern.length){
            return false;
        }
        return true;
    }
    
    private static boolean upLeft(char [][] grid, int i, int j, char [] pattern){
        int k = 0;
        int l = i;
        int m = j;
        while(l>-1 && m>-1 && k<pattern.length){
            if(grid[l][m]!=pattern[k]){
                return false;
            }
            k++;
            l--;
            m--;
        }
        if(k!=pattern.length){
            return false;
        }
        return true;
    }
    
    private static boolean downLeft(char [][] grid, int i, int j, char [] pattern){
        int k = 0;
        int l = i;
        int m = j;
        while(l<grid.length && m>-1 && k<pattern.length){
            if(grid[l][m]!=pattern[k]){
                return false;
            }
            k++;
            l++;
            m--;
        }
        if(k!=pattern.length){
            return false;
        }
        return true;
    }
    
    private static boolean downRight(char [][] grid, int i, int j, char [] pattern){
        int k = 0;
        int l = i;
        int m = j;
        while(l<grid.length && m<grid[0].length && k<pattern.length){
            if(grid[l][m]!=pattern[k]){
                return false;
            }
            k++;
            l++;
            m++;
        }
        if(k!=pattern.length){
            return false;
        }
        return true;
    }
    
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = Integer.parseInt(input.nextLine());
	    
	    for(int c=0;c<t;c++){
	        String [] params = input.nextLine().trim().split(" ");
	        int n = Integer.parseInt(params[0]);
	        int m = Integer.parseInt(params[1]);
	        
	        String [] text = input.nextLine().trim().split(" ");
	        char [] pattern = input.nextLine().trim().toCharArray();
	        
	        char [][] grid = new char[n][m];
	        
	        int k = 0;
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                grid[i][j] = text[k].charAt(0);
	                k++;
	            }
	        }
	        
	        List<String> list = new ArrayList<String>();
	        for(int i=0;i<n;i++){
	            boolean found = false;
	            for(int j=0;j<m;j++){
	                found = up(grid,i,j,pattern);
	                if(!found){
	                    found = down(grid,i,j,pattern);
	                }
	                if(!found){
	                    found = left(grid,i,j,pattern);
	                }
	                if(!found){
	                    found = right(grid,i,j,pattern);
	                }
	                if(!found){
	                    found = upRight(grid,i,j,pattern);
	                }
	                if(!found){
	                    found = upLeft(grid,i,j,pattern);
	                }
	                if(!found){
	                    found = downRight(grid,i,j,pattern);
	                }
	                if(!found){
	                    found = downLeft(grid,i,j,pattern);
	                }
	                if(found){
	                    list.add(i+" "+j);
	                }
	            }
	        }
	        if(list.size()==0){
	            System.out.println(-1);
	            continue;
	        }
	        for(String s : list){
	            System.out.print(s + ", ");
	        }
	        System.out.println();
	    }
	}
}