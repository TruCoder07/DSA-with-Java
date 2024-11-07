public class PrefixSum{
    
    public static void PrefixSumx(int numbers[]){
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        int prefixSum[] =new int[numbers.length];
        prefixSum[0]=numbers[0] ;
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i]=prefixSum[i-1]+numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            int start=i;
            for (int j = 0; j < numbers.length; j++) {
                int end=j;
                currSum = start==0?prefixSum[end]:prefixSum[end]-prefixSum[start-1];
               if (maxSum<currSum) {
                maxSum=currSum;
               } 
            }
        }
        
        System.out.println("Max Sum = "+maxSum);
    }
    public static void kadanes(int num[]){
        int curr =0;
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (curr<=0) {
                curr=0;
            } else {
                curr=curr+num[i];
            }
        }
        if (curr>maxSum) {
            maxSum=curr;
        }
        System.out.println("Max Sum = "+maxSum);
    }
    public static void main(String[] args) {
        // int num[]= {1,-2,6,-1,3};
        // PrefixSumx(num);
        int nums[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(nums);
    }

}