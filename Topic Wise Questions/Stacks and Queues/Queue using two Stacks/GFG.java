/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

class GfG
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    /* The method insert to push element into the queue */
    void insert(int B)
    {
	    s1.push(B);
    }
	
    
    /*The method remove which return the element popped out of the queue*/
    int remove()
    {
        if(s1.isEmpty()){
            return -1;
        }
	    while(!s1.isEmpty()){
	        s2.push(s1.pop());
	    }
	    
	    int result = s2.pop();
	    
	    while(!s2.isEmpty()){
	        s1.push(s2.pop());
	    }
	    
	    return result;
    }
}