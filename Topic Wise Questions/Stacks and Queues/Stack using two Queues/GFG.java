/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

class GfG
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    /*The method pop which return the element poped out of the stack*/
    int pop()
    {
	    if(q1.isEmpty() && q2.isEmpty()){
	        return -1;
	    }
	    int result = -1;
	    if(q1.isEmpty()){
	        while(!q2.isEmpty()){
	            int num = q2.poll();
	            if(!q2.isEmpty()){
	                q1.add(num);
	            }
	            else{
	                result = num;
	                break;
	            }
	        }
	    }
	    else{
	        while(!q1.isEmpty()){
	            int num = q1.poll();
	            if(!q1.isEmpty()){
	                q2.add(num);
	            }
	            else{
	                result = num;
	                break;
	            }
	        }
	    }
	    return result;
    }
	
    /* The method push to push element into the stack */
    void push(int a)
    {
	    if(q1.isEmpty()){
	        q2.add(a);
	    }
	    else{
	        q1.add(a);
	    }
    }
}