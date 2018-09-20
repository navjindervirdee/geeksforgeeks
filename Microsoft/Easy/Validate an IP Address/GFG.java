/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
class Solution {
	public boolean isValidIP(String s){
	   char [] arr = s.toCharArray();
	   int count = 0;
	   for(char c : arr){
	       if(c=='.'){
	           count++;
	       }
	   }
	   if(count!=3){
	       return false;
	   }
	   String [] array = s.split("\\.");
	   if(array.length!=4){
	       return false;
	   }
	   
	   for(String str : array){
	       if(str.length() ==0 || str.length()>3 || (str.length()>1 && str.charAt(0)=='0')){
	           return false;
	       }
	       int  num = 0;
	       try{
	         num = Integer.parseInt(str);
	       }
	       catch(Exception e){
	           return false;
	       }
	       if(num<0 || num > 255){
	           return false;
	       }
	   }
	   return true;
	}
}