public class sortingByBubble{
    public static void sorting(int number[]){
        for (int turn = 0; turn < number.length-1; turn++) {
            for (int i = 0; i < number.length-1-turn; i++) {
                if (number[i]>number[i+1]) {
                    int temp=number[i];
                    number[i]=number[i+1];
                    number[i+1]=temp;
                }
            }
        }
    }
    public static void printSoring(int number[]){
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int num[]={5,4,1,3,2};
        sorting(num);
        printSoring(num);
    }
}