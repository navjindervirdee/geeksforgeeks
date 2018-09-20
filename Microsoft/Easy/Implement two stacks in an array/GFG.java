/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* Structure of the class is
class TwoStack
{
	int size;
	int top1,top2;
	int arr[] = new int[100];
	TwoStack()
	{
		size = 100;
		top1 = -1;
		top2 = size;
	}
}*/
class GfG
{
    // sq is the object of class TwoStack
    /* The method push to push element into the stack 2 */
    void push1(int x, TwoStack sq)
    {
        if(sq.top1+1==sq.top2){
            return;
        }
        sq.top1++;
        sq.arr[sq.top1] = x;
    }
    /* The method push to push element into the stack 2*/
    void push2(int x, TwoStack sq)
    {
        if(sq.top2-1==sq.top1){
            return;
        }
        sq.top2--;
        sq.arr[sq.top2] = x;
    }
    /* The method pop to pop element from the stack 1 */
    int pop1(TwoStack sq)
    {
        if(sq.top1==-1){
            return -1;
        }
        sq.top1--;
        return sq.arr[sq.top1+1];
    }
    /* The method pop to pop element from the stack 2 */
    int pop2(TwoStack sq)
    {
        if(sq.top2==sq.size){
            return -1;
        }
        sq.top2++;
        return sq.arr[sq.top2-1];
    }
}