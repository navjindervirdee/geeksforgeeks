/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

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
        Set<Node> set = new HashSet<Node>();
        Node temp = node;
        while(temp!=null){
            if(set.contains(temp)){
                temp.next = null;
                break;
            }
            set.add(temp);
            temp = temp.next;
        }
        return 1;
    }
}