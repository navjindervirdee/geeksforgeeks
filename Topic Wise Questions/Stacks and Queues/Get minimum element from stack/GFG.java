/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

class GfG
{
    int minEle;
    Stack<Integer> s;
    /*returns min element from stack*/
    int getMin()
    {
        if(s == null || s.isEmpty()){
            return -1;
        }
	    return minEle;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
        if(s==null || s.isEmpty()){
            return -1;
        }
	    int num = s.pop();
	    if(num>=minEle){
	        return num;
	    }
	    else{
	        int result = minEle;
	        minEle = 2*minEle - num;
	        return result;
	    }
	}
    /*push element x into the stack*/
    void push(int x)
    {
	    if(s==null){
	        s = new Stack<Integer>();
	    }
	    if(s.isEmpty()){
	        s.push(x);
	        minEle = x;
	        return;
	    }
	    if(x<minEle){
	        s.push(2*x-minEle);
	        minEle = x;
	    }
	    else{
	        s.push(x);
	    }
	    
    }	
}