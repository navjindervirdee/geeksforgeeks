''' Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above. '''

"""  Pairwise swap the elements in a linked list.
  The input list will have at least one element
  Return reference to head of rotated linked list
  Node is defined as
class Node:
    def __init__(self, data):
		self.data = data
		self.next = None
  This is method only submission.
  You only need to complete the method.
"""
def pairWiseSwap(head):
    if(head==None):
        return head
    current  = head.next
    prev = head
    while(current!=None):
        temp = prev.data
        prev.data = current.data
        current.data = temp
        prev = current.next
        if(prev!=None):
            current = prev.next;
        else:
            current = None
    return head