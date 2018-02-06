/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


class GfG
 {
	String encode(String str){
	    char prev = str.charAt(0); 
	    int count = 1;
	    String result = "";
	    for(int i=1;i<str.length();i++){
	        char c = str.charAt(i);
	        if(prev==c){
	            count++;
	        }
	        else{
	            result = result + prev + Integer.toString(count);
	            prev = c;
	            count=1;
	        }
	    }
	    result = result + prev + count;
	    return result;
          //Your code here
	}
	
 }