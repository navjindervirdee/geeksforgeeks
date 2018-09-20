/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*
The structure of the node of the stack is
class StackNode
{
	int data;
	StackNode next;
}
class Stack_using_LinkedList
{
	 StackNode top;
}
*/
// This is method only submission
class GfG
{
	/* The method push to push element into the stack */
        void push(int a,Stack_using_LinkedList ob)
	{
	    StackNode node = new StackNode();
		node.data = a;
		node.next = ob.top;
		ob.top = node;
	}
        /*The method pop which return the element poped out of the stack*/
	int pop(Stack_using_LinkedList ob)
	{
	    if(ob.top==null){
	        return -1;
	    }
		int result = ob.top.data;
		ob.top = ob.top.next;
		return result;
	}
	
}