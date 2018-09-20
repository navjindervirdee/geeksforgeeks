import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static class Activity{
        int start;
        int end;
        
        public Activity(int start, int end){
            this.start = start;
            this.end  = end;
        }
    }
    
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    for(int c=0;c<t;c++){
	        int n = Integer.parseInt(br.readLine());
	        String [] temp1 = br.readLine().trim().split(" ");
	        String [] temp2 = br.readLine().trim().split(" ");
	        //System.out.println(temp1.length + " " + temp2.length);
	        Activity [] array = new Activity[n];
	        
	        for(int i=0;i<n;i++){
	            int start = Integer.parseInt(temp1[i]);
	            int end = Integer.parseInt(temp2[i]);
	            Activity ac = new Activity(start,end);
	            array[i] = ac;
	        }
	        
	        Arrays.sort(array, new Comparator<Activity>(){
	            public int compare(Activity a1, Activity a2){
	                return a1.end-a2.end;
                }
            });
            
            int max = 1;
            int end = array[0].end;
            
            for(int i=1;i<array.length;i++){
                if(array[i].start>=end){
                    max++;
                    end = array[i].end;
                }
            }
            
            System.out.println(max);
        }
	}
}