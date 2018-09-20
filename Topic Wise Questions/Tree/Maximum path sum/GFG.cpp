/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below
Node is as follows
struct Node{
	int data;
	Node *left, *right;
};
*/
int* maxSum(struct Node *root){
    if(root==NULL){
        int * array = new int[2];
        array[0] = 0;
        array[1] = 0;
        return array;
    }
    
    int *left = maxSum(root->left);
    int *right = maxSum(root->right);
    
    int pathSum = root->data;
    
    if(left[0]>right[0]){
        pathSum += left[0];
    }
    else{
        pathSum += right[0];
    }
   
    int * array = new int[2];
    array[0] = pathSum;
    int max = left[0] + right[0] + root->data;
    
    if((left[1])>max){
        max=(left[1]);
    }
    if(right[1]>max){
        max = (right[1]);
    }
    
    array[1] = max;
    
    return array;
}
int maxPathSum(struct Node *root){
    int *array = maxSum(root);
    return array[1];
}
