/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*Complete The function
Node is as follows:
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/
class GfG{
      int removeTheLoop(Node node) {
	      Set<Node> set =  new HashSet<Node>();
	      Node temp = node;
	      Node prev = null;
	      while(temp != null){
	          if(set.contains(temp)){
	              break;
	          }
	          set.add(temp);
	          prev = temp;
	          temp = temp.next;
	          
	      }
	      prev.next = null;
	      return 1;
//add code here.
}
}