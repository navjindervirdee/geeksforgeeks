''' Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above. '''

# your task is to complete this Function
# Function shouldn't return anything
def skipMdeleteN(head, M, N):
    if(head==None):
        return head
        
    if(M==0 and N==0):
        return head
        
    if(M==0 and N!=0):
        return None
        
    if(M!=0 and N==0):
        return head
    
    curr = head
    prev = None
    i = 0
    while(curr is not None):
        if(i<M):
            prev = curr
            curr = curr.next
            i+=1
            continue
        
        
        n = prev.next
        j=0
        while(n is not None):
            if(j<N):
                n = n.next
                j+=1;
                continue
            break
        prev.next = n
        curr = n
        i = 0
    
    return head
        