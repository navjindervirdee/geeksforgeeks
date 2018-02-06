int findMax(Height arr[], int n)
{

    long max = -1;

    for(int i=0;i<n;i++){

        long height = arr[i].feet*12 + arr[i].inches;

        if(max<height){

            max =  height;

        }

    }

    return max;


}