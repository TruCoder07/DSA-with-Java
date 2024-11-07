public class Kadanes{
    
    public static void kadanes(int num[]){
        int curr =0;
        int mincurr =0;
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            curr=curr+num[i];
            mincurr=mincurr+num[i];
            // minSum=Math.min(maxSum, mincurr);
            if (curr<0) {
                curr=0;
            }
            maxSum=Math.max(curr, maxSum);
            if (mincurr>minSum) {
                minSum=mincurr;
            }
             
    }
        if (maxSum<=0) {
            System.out.println("Max Sum = "+minSum); 
        }
        else{
            System.out.println("Max Sum = "+maxSum);
        } 
}    


public static int maxSubArray(int arr[]) {
    int currSum = 0;
    int maxSum = arr[0]; // Start with the first element to handle all-negative arrays

    for (int i = 0; i < arr.length; i++) {
        currSum += arr[i];

        // Update maxSum to the maximum of current maxSum or currSum
        maxSum = Math.max(maxSum, currSum);

        // If currSum goes below 0, reset it
        if (currSum < 0) {
            currSum = 0;
        }
    }
    return maxSum;
}

    public static void main(String[] args) {
        // int num[]= {1,-2,6,-1,3};
        // PrefixSumx(num);
        int nums[]={-2,-3,4,-1,-2,1,5,-3};
        int numss[]={-1,-2,-3,-4};
        kadanes(nums);
        kadanes(numss);
    }

}