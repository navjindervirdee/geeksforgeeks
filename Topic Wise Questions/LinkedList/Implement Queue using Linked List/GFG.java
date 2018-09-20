/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*
The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
}
and the structure of the class is
class Queue_using_LinkedList
{
	 QueueNode front;
	QueueNode rear;
}
*/
class GfG
{
	
        /* The method push to push element into the queue*/
        void push(int a,Queue_using_LinkedList ob)
	{
		QueueNode node = new QueueNode();
		node.data = a;
		if(ob.rear == null && ob.front == null){
		    ob.rear = node;
		    ob.front = node;
		}
		else{
		    ob.rear.next = node;
		    ob.rear = node;
		}
	}
        
        /*The method pop which return the element poped out of the queue*/
	int pop(Queue_using_LinkedList ob)
	{
		
		if(ob.front==null){
		    return -1;
		}
		int result = ob.front.data;
		if(ob.front==ob.rear){
		    ob.front = null;
		    ob.rear = null;
		}
		else{
			ob.front = ob.front.next;
		}
		return result;
	}
}