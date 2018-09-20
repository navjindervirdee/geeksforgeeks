''' Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above. '''

"""Return reference of new head of the reverse linked list
  The input list will have at least one element
  Node is defined as
class Node:
    def __init__(self, data):
		self.data = data
		self.next = None
  This is method only submission.
  You only need to complete the method.
"""

    
def reverse(head, k):
    if(head==None):
        return head
    if(k==1):
        return head
    current = head
    newHead = None
    prev = None
    prevlast = None
    first = head
    
    i = 0
    
    while(current!=None):
        if(i<k-1):
            next = current.next
            current.next = prev
            prev = current
            current = next
            i+=1
            continue
        if(i==k-1):
            next = current.next
            current.next = prev
            prev = current
            current = next
            
            if(newHead==None):
                newHead = prev
            if(prevlast!=None):
                prevlast.next = prev
                prevlast = first
                first = current
            else:
                prevlast = first
                first = current
            prev = None
            i=0
    if(prevlast!=first):
        prevlast.next = prev
                
    return newHead