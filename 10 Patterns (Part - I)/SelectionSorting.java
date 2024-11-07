public class SelectionSorting{
    public static void sortingBySelection(int number[]){
        for (int i = 0; i < number.length-1; i++) {
            int minPoss=i;
            for (int j = i+1; j < number.length; j++) {
                if (number[minPoss]>number[j]) {
                    minPoss=j;
                }
            }
            int temp=number[minPoss];
            number[minPoss]=number[i];
            number[i]=temp;
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int num[]={5,4,1,3,2};
        sortingBySelection(num);
    }
}