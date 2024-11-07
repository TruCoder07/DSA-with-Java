public class ReverseArrays{
    public static void ReverseAnArray(int n[]){
        System.out.print("Reverse Arrays = { ");
        int newArray[]=new int[n.length];
        for (int i = n.length - 1, j = 0; i >= 0; i--, j++) {
                newArray[j] = n[i];
                System.out.print(newArray[j]+", ");
        }
        System.out.print(" }");
    }
    public static void main(String[] args) {
        int number[]={2,3,21,345,677,1};
        System.out.print("My Arrays = { ");
        for (int i = 0; i <=number.length-1; i++) {
            System.out.print(number[i]+", ");
        }
        System.out.print(" }");
        System.out.println("");
        ReverseAnArray(number);
        
    }
}