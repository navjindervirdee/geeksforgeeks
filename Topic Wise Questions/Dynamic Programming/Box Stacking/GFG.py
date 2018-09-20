#Your task is to complete this function
#Function should return an integer denoting the required answer
import functools
@functools.total_ordering
class Box:
    def __init__(self,length,width,height):
        self.length = length
        self.width = width
        self.height = height
        
    def __le__(self,other):
        return self.length < other.length
    
def maxHeight(height, width, length, n):
    boxes = list()
    for i in range(0,n):
        h = height[i]
        w = width[i]
        l = length[i]
        sort = sorted([h,w,l])
        
        box1 = Box(sort[0],sort[1],sort[2])
        box2 = Box(sort[0],sort[2],sort[1])
        box3 = Box(sort[1],sort[2],sort[0])
        
        boxes.append(box1)
        boxes.append(box2)
        boxes.append(box3)
    
    boxes = sorted(boxes)
    
    maxHeight = [0]*len(boxes)
    
    for i in range(0,len(boxes)):
        box = boxes[i];
        maxHeight[i] = box.height
        
        for j in range(i-1,-1,-1):
            temp = boxes[j]
            if(temp.length<box.length and temp.width<box.width):
                maxHeight[i] = max(maxHeight[i],maxHeight[j]+box.height)
    return max(maxHeight)