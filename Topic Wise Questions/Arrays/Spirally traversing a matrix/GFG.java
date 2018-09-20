import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    for(int c=0;c<t;c++){
	        int m = 4;
	        int [][] mat = new int[m][m];
	        
	        for(int i=0;i<m;i++){
	            String [] temp = br.readLine().trim().split(" ");
	            for(int j=0;j<m;j++){
	                mat[i][j] = Integer.parseInt(temp[j]);
	            }
	        }
	        
	        List<Integer> list = new ArrayList<Integer>();
	        for(int i=0;i<m/2;i++){
	            int j = 0;
	            for(j=i;j<m-i;j++){
	                list.add(mat[i][j]);
	            }
	            
	            int k ;
	            for(k=i+1;k<m-i;k++){
	                list.add(mat[k][j-1]);
	            }
	            
	            j-=2;
	            for(;j>=i;j--){
	                list.add(mat[k-1][j]);
	            }
	            
	            k-=2;
	            for(;k>i;k--){
	                list.add(mat[k][j+1]);
	            }
	        }
	        
	        for(int i=0;i<list.size();i++){
	            System.out.print(list.get(i) + " ");
	        }
	        System.out.println();
	    }
	}
}