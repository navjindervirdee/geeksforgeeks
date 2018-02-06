import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    input.nextLine();
	    for(int k=0;k<t;k++){
	        char [] exp = input.nextLine().trim().toCharArray();
	        Stack<Character> stack = new Stack<Character>();
	        boolean balanced = true;
	        for(int i=0;i<exp.length;i++){
	            char c = exp[i];
	            if(c=='{' || c=='(' || c=='['){
	                stack.push(c);
	                continue;
	            }
	            if(stack.isEmpty()){
	                balanced = false;
	                break;
	            }
	            char top = stack.pop();
	            if(c=='}' && top!='{'){
	                balanced = false;
	                break;
	            }
	            
	            if(c==']' && top !='['){
	                balanced = false;
	                break;
	            }
	            
	            if(c==')' && top!='('){
	                balanced = false;
	                break;
	            }
	        }
	        
	        balanced = balanced && stack.isEmpty();
	        if(balanced){
	            System.out.println("balanced");
	        }
	        else{
	            System.out.println("not balanced");
	        }
	    }
	}
}