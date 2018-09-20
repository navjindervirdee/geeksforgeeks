/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*you are required to complete this method */
class GfG{
	public boolean isInterLeave(String a,String b,String c){
	    char [] array1 = a.toCharArray();
	    char [] array2 = b.toCharArray();
	    char [] array3 = c.toCharArray();
	    
	    if(array3.length != array1.length + array2.length){
	        return false;
	    }
	    
        boolean [][] table = new boolean[array1.length+1][array2.length+1];
        
        table[0][0] = true;
        
        for(int i=1;i<array2.length+1;i++){
            if(array2[i-1]==array3[i-1]){
                table[0][i] = table[0][i-1];
            }
        }
        
        for(int i=1;i<array1.length+1;i++){
            if(array1[i-1]==array3[i-1]){
                table[i][0] = table[i-1][0];
            }
        }
        
        
        for(int i=1;i<array1.length+1;i++){
            for(int j=1;j<array2.length+1;j++){
                if(array3[i+j-1]==array1[i-1] && array3[i+j-1]!=array2[j-1]){
                    table[i][j] = table[i-1][j];
                    continue;
                }
                
                if(array3[i+j-1]==array2[j-1] && array3[i+j-1]!=array1[i-1]){
                    table[i][j] = table[i][j-1];
                    continue;
                }
                
                if(array3[i+j-1]==array2[j-1] && array3[i+j-1]==array1[i-1]){
                    table[i][j] = table[i-1][j] || table[i][j-1];
                }
                
                
            }
        }
        return table[array1.length][array2.length];
	}
}