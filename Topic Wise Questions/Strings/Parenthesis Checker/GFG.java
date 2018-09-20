import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    for(int c=0;c<t;c++){
	        char [] array = br.readLine().trim().toCharArray();
	        
	        Stack<Character> stack = new Stack<Character>();
	        String result = "balanced";
	        for(int i=0;i<array.length;i++){
	            if(array[i]=='{' || array[i] == '[' || array[i] == '('){
	                stack.push(array[i]);
	                continue;
	            }
	            
	            if(array[i]=='}'){
	                if(stack.isEmpty() || stack.pop()!='{'){
	                    result = "not balanced";
	                    break;
	                }
	                continue;
	            }
	            if(array[i]==']'){
	                if(stack.isEmpty() || stack.pop()!='['){
	                    result = "not balanced";
	                    break;
	                }
	                continue;
	            }
	            if(array[i]==')'){
	                if(stack.isEmpty() || stack.pop()!='('){
	                    result = "not balanced";
	                    break;
	                }
	            }
	        }
	        if(!stack.isEmpty()){
	            result = "not balanced";
	        }
	        System.out.println(result);
	    }
	}
}