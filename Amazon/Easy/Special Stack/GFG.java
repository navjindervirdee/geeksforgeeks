/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*Complete the function(s) below*/
class GfG{
	public void push(int a,Stack<Integer> s)
	{
	    s.push(a);
	}
	public int pop(Stack<Integer> s)
        {
            return s.pop();
	}
	public int min(Stack<Integer> s)
        {
           Stack<Integer> temp = new Stack<Integer>();
           int m = Integer.MAX_VALUE;
           while(!s.isEmpty()){
               int num = s.pop();
               m = Math.min(num,m);
               temp.push(num);
           }
           while(!temp.isEmpty()){
               s.push(temp.pop());
           }
           return m;
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           return s.size()==n;
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           return s.isEmpty();
	}
}