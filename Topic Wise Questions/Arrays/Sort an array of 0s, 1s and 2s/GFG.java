import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    for(int c=0;c<t;c++){
	        int n = Integer.parseInt(br.readLine());
	        String temp [] = br.readLine().trim().split(" ");
	        int count [] = new int[3];
	        for(int i=0;i<n;i++){
	            int num = Integer.parseInt(temp[i]);
	            count[num]++;
	        }
	        int [] array = new int[n];
	        int k = 0;
	        for(int i=0;i<count.length;i++){
	            while(count[i]>0){
	                array[k] = i;
	                count[i]--;
	                k++;
	            }
	        }
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        for(int i=0;i<n;i++){
	            bw.write(Integer.toString(array[i]) + " ");
	        }
	        bw.write("\n");
	        bw.flush();
	        
	    }
	    
	}
}