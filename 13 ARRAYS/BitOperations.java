public class BitOperations{
    public static int SetIthBit(int n , int i){
        int bitMask=1<<i;
        return n|bitMask;
    }

    public static int ClearIthBit(int n , int i){
        int bitMask=~(1<<i);
        return n&bitMask;
    }
    public static int UpdateIthBit(int n , int i, int newBit){
        int bitMask=newBit<<i;
        if (newBit==0) {
            return n&bitMask;
        } else {
            return n|bitMask; 
        }
    }
        
    public static int ClearIBits(int n, int i) {
            int bitMask = (~0) << i;
            return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(ClearIBits(15, 2));
    }
}