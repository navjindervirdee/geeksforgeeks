/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below*/
class GfG
{
    static class Element{
        int i;
        int j;
        int val;
        
        public Element(int i, int j, int val){
            this.i = i;
            this.j = j;
            this.val = val;
        }
    }
    
    public static ArrayList<Integer> mergeKArrays(int[][] arrays,int k){
        PriorityQueue<Element> queue = new PriorityQueue<Element>(new Comparator<Element>(){
            public int compare(Element e1, Element e2){
                return e1.val - e2.val;
            }
        });
        
        for(int i=0;i<k;i++){
            queue.add(new Element(i,0,arrays[i][0]));
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = 0;
        while(!queue.isEmpty()){
            Element el = queue.poll();
            list.add(el.val);
            if(el.j+1<k){
                queue.add(new Element(el.i,el.j+1,arrays[el.i][el.j+1]));
            }
        }
        return list;
    }
}