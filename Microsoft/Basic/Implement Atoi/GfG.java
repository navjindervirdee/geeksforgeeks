/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*You are required to complete this method */
class GfG
{
    int atoi(String str)
    {
        try{
	        int num = Integer.parseInt(str);
	        return num;
        }
        catch(Exception e){
	        return -1;
        }
    }
}