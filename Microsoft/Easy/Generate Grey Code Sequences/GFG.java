
/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Prints the space separated n-bit gray codes sequence.
You are required to complete below method. */
class GfG
{
    void generateCode(int n){
	    List<String> list = new ArrayList<String>();
	    list.add("0");
	    list.add("1");
	    int l = 1;
	    while(l<n){
	        List<String> temp = new ArrayList<String>();
	        for(int i=0;i<list.size();i++){
	            StringBuilder sb = new StringBuilder("0" + list.get(i));
	            temp.add(sb.toString());
	        }
	        
	        for(int i=list.size()-1;i>-1;i--){
	            StringBuilder sb = new StringBuilder("1" + list.get(i));
	            temp.add(sb.toString());
	        }
	        list = temp;
	        l=l+1;
	    }
	    
	    for(int i=0;i<list.size();i++){
	        System.out.print(list.get(i) + " ");
	    }
	}
}