/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}*/
class GfG{
	public static void insert(Node zhead,int value,int n){
	     Node temp = zhead;
         Node prev = null;
         Node node = new Node(value);
         if(zhead==null){
             zhead = node;
             node.next = zhead;
             return;
         }
         int i=0;
         while(i!=n){
             if(temp.data>value){
                 break;
             }
             prev = temp;
             temp =temp.next;
             i++;
         }
         temp = zhead;
         if(prev == null){
             while(i!=n-1){
                 temp =temp.next;
                 i++;
             }
             Node next = zhead;
             zhead = node;
             node.next = next;
             temp.next = zhead;
         }
         else{
             Node next = prev.next;
             prev.next = node;
             node.next = next;
         }
         temp = zhead;
         i=0;
         while(i!=n+1){
             System.out.print(temp.data + " ");
             temp = temp.next;
             i++;
         }
         
    }
}