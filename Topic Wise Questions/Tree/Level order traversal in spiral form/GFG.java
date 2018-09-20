class GfG
{
    void printSpiral(Node node){
        Queue<Node> queue = new LinkedList<Node>();
        Node temp = new Node(-1);
        queue.add(node);
        queue.add(temp);
        List<Integer> list = new ArrayList<Integer>();
        int left = 0;
        
        while(!queue.isEmpty()){
            Node n = queue.poll();
            if(n.data==-1){
                if(!queue.isEmpty()){
                    queue.add(n);    
                }
                
                if(left==1){
                    for(int i=0;i<list.size();i++){
                        System.out.print(list.get(i) + " ");
                    }
                    left = 0;
                }
                else{
                    for(int i=list.size()-1;i>-1;i--){
                        System.out.print(list.get(i) + " ");
                    }
                    left = 1;
                }
                list = new ArrayList<Integer>();
                continue;
            }
            list.add(n.data);
            if(n.left!=null){
                queue.add(n.left);
            }
            if(n.right!=null){
                queue.add(n.right);
            }
        }
    }
}