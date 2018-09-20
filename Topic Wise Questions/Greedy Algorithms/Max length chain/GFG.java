class GfG
{
    int maxChainLength(Pair arr[], int n){
        Arrays.sort(arr, new Comparator<Pair>(){
            public int compare(Pair p1, Pair p2){
                if(p1.y==p2.y){
                    return p1.x-p2.x;
                }
                else{
                    return p1.y-p2.y;
                }
            }
        });
        
        int num = 0;
        int i = 0;
        int prev = -1;
        while(i<arr.length){
            if(arr[i].x>prev){
                num++;
                prev = arr[i].y;
            }
            i++;
        }
        return num;
    }
}