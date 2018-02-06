import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    private static Map<Character,Long> createMap(){
        Map<Character,Long> map = new HashMap<Character,Long>();
        long id = 0;
        for(char i='a'; i<='z';i++){
            map.put(i,id);
            id++;
        }
        for(char i ='A';i<='Z';i++){
            map.put(i,id);
            id++;
        }
        for(char i='0';i<='9';i++){
            map.put(i,id);
            id++;
        }
        return map;
    }
    
    public static void main (String[] args) {
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    Map<Character,Long> map = createMap();
	    Map<Long,Character> revmap = new HashMap<Long,Character>();
	    for(Map.Entry<Character, Long> entry : map.entrySet()){
            revmap.put(entry.getValue(), entry.getKey());
        }
        
	    input.nextLine();
	    for(int c = 0; c<t;c++){
	        String str = input.nextLine().trim();
	        long num = Long.parseLong(str);
	        long store = num;
	        String result = "";
    		while(num!=0){
    		    long rem = num%62;
    		    result = result + Character.toString(revmap.get(rem));
    		    num = num/62;
    		}
    		result = new StringBuilder(result).reverse().toString();
    		num = map.get(result.charAt(0));
    		for(int i=1;i<result.length();i++){
    		    char c1 = result.charAt(i);
    		    long n2 = map.get(c1);
    		    num = 62*num + n2;
    		}
    		
    		System.out.println(result);
    		System.out.println(num);
	    }
	    
	}
}