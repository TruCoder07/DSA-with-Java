public class ArrayQ1{

static int linerSearch(int n[], int key){
    for (int i = 1; i <n.length; i++){
        if(n[i]==key){
            return i;
        }
    }
    return -1;
}

static void pairInarray(int n[]){
    for (int i = 0; i <n.length; i++){
        for (int j = i+1; j < n.length; j++) {
            System.out.print("("+n[i]+","+n[j]+") ");
        }
        System.out.println("");
    }
}

static void subArrays(int n[]){
    int totoSubArry=0;
    int currSum;
    int currmin;
    int smallest=Integer.MAX_VALUE;
    int largest=Integer.MIN_VALUE;
    for (int i = 0; i < n.length; i++) {
        for (int j = i; j < n.length; j++) {
            currSum=0;
            currmin=0;
            for (int j2 = i; j2 <=j; j2++) {
                System.out.print(n[j2]+" ");
                currSum+=n[j2];
                currmin+=n[j2];
            }
            if (largest<currSum) {
                largest=currSum;
            }
            if (smallest>currmin) {
                smallest=currmin;
            }
            totoSubArry++;
            System.out.println("");
        }
        System.out.println("");
    }

    System.out.println("The total subarray = "+ totoSubArry);
    System.out.println("The maximum subarray = "+ largest);
    System.out.println("The minimum subarray = "+ smallest);
}

    public static void main(String[] args) {
        int l = 4;
        int number[]={2,4,6,8,10};
        subArrays(number);
        pairInarray(number);
        int a= linerSearch(number,l);
        if (a==1) {
            System.out.print("Key finded at index = "+a);
        } else {
            System.out.print("Key not finded; ");
        }

    }    
}