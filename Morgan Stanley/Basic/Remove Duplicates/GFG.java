/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


class GfG
{
    int remove_duplicate(int a[])
	{
	    Set<Integer> set = new HashSet<Integer>();
	    for(int i=0;i<a.length;i++){
	        set.add(a[i]);
	    }
	    int i=0;
	    int [] temp = new int[set.size()];
	    for(int key : set){
	        temp[i] = key;
	        i++;
	    }
	    Arrays.sort(temp);
	    for(int j=0;j<temp.length;j++){
	        a[j] = temp[j];
	    }
	    return set.size();
	}
}