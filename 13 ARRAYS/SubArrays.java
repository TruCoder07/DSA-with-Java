public class SubArrays{
    public static void SubArray(int numbers []){
        int tsa=0;
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int min=0;
            for (int j = i; j < numbers.length; j++) {
                sum=0;
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k]+" ");
                    sum=sum+numbers[k];
                }
                if (maxSum < sum) {
                    maxSum = sum;
                }
                System.out.print(": Sum of this Sub Array = "+sum);
                // sum=0;
                tsa++;
                System.out.println("");
            }
            System.out.println("");
        }
        System.out.println("Maximum sum from All Sub Array = "+maxSum);
        System.out.print("Total Sub Arrays = "+tsa);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        SubArray(numbers);
    }

}