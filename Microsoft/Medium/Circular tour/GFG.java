/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

// In java function tour() takes two arguments array of petrol
// and array of distance
class GfG
{
    boolean canReach(int index, int [] petrol, int [] distance, boolean [] visited){
        int start = index;
        int end = (index-1)%petrol.length;
        if(end<0){
            end += petrol.length;
        }
        
        boolean once = true;
        int capacity = 0;
        while(once || start!=index){
            visited[start] = true;
            capacity += petrol[start];
            if(distance[start]>capacity){
                return false;
            }
            capacity -= distance[start];
            start = (start+1)%petrol.length;
            if(start==index){
                once = false;
            }
        }
        return true;
    }
    
    int tour(int petrol[], int distance[]){
	    boolean [] checked = new boolean[petrol.length];
	    int result = -1;
	    for(int i=0;i<petrol.length;i++){
	        if(checked[i]){
	            continue;
	        }
	        checked[i] = true;
	        boolean check = canReach(i,petrol,distance,checked);
	        if(check){
	            result = i;
	            break;
	        }
	    }
	    //System.out.println((-1%6));
	    return result;
    }
}