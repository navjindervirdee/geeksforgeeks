import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();//Integer.parseInt(br.readLine());
        
        for(int c=0;c<t;c++){
            int n = input.nextInt();//Integer.parseInt(br.readLine());
            //String [] temp = br.readLine().trim().split(" ");
            
            int [] cuts = new int[3];
            for(int i=0;i<cuts.length;i++){
                cuts[i] = input.nextInt();//Integer.parseInt(temp[i]);
            }
            
            Arrays.sort(cuts);
            
            int max[] = new int[n+1];
            
            for(int i=1;i<n+1;i++){
                for(int j=0;j<cuts.length;j++){
                    if(cuts[j]>i){
                        break;
                    }
                    if(i-cuts[j]==0 || max[i-cuts[j]]!=0){
                        max[i] = Math.max(max[i],max[i-cuts[j]]+1);
                    }
                }
            }
            System.out.println(max[n]);
        }
	}
}