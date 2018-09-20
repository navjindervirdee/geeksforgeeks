/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the provided function*/
class GfG{
    static String encoder(String str){
        char [] array = str.toCharArray();
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        StringBuilder sb = new StringBuilder();
        
        int code = 0;
        for(int  i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                sb.append(map.get(array[i]));
                continue;
            }
            sb.append(code);
            map.put(array[i],code);
            code++;
        }
        return sb.toString();
    }
    
    public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern){
        ArrayList<String> list = new ArrayList<String>();
        
        String hash = encoder(pattern);
        for(String s : dict){
            String temp = encoder(s);
            if(temp.equals(hash)){
                list.add(s);
            }
        }
        return list;
        
    }
}