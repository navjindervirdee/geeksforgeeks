import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static class Meeting{
        int start;
        int end;
        int index;
        
        public Meeting(int start, int end,int index){
            this.start = start;
            this.end = end;
            this.index = index;
        }
    }
    
	public static void main (String[] args) throws Exception{
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     int t = Integer.parseInt(br.readLine());
	     
	     for(int c=0;c<t;c++){
	         int n = Integer.parseInt(br.readLine());
             String [] temp1 = br.readLine().trim().split(" ");
             String [] temp2 = br.readLine().trim().split(" ");
             
             Meeting [] array = new Meeting[n];
             
             for(int i=0;i<n;i++){
                 int start = Integer.parseInt(temp1[i]);
                 int end = Integer.parseInt(temp2[i]);
                 
                 Meeting meeting =new Meeting(start,end,i);
                 
                 array[i] = meeting;
             }
             
             Arrays.sort(array, new Comparator<Meeting>(){
                 public int compare(Meeting m1, Meeting m2){
                     return m1.end - m2.end;
                 }
             });
             
             List<Integer> list = new ArrayList<Integer>();
             list.add(array[0].index+1);
             int end = array[0].end;
             
             for(int i=1;i<n;i++){
                 if(array[i].start>=end){
                     list.add(array[i].index+1);
                     end = array[i].end;
                 }
             }
             
             for(int i=0;i<list.size();i++){
                 System.out.print(list.get(i) + " ");
             }
             
             System.out.println();
	        
	     }
	}
}