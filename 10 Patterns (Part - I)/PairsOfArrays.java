public class PairsOfArrays{
    public static void Pairs(int numbers[]){
        int tp =0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i; j <numbers.length; j++) {
             System.out.print("("+curr+","+j+")");   
             tp++;
            }
         System.out.println("");   
        }
        System.out.println("Total Pair = "+tp);
    }
    public static void main(String[] args) {
        int numbers[] = {0,1,2,3,4,5,6};
        Pairs(numbers);
    }

}