public class BitsOperations {
    public static int SetIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int ClearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int UpdateIthBit(int n, int i, int newBit) {
        // First, clear the ith bit
        int bitMask = ~(1 << i);
        // Then set the new bit value
        return (n & bitMask) | (newBit << i);
    }

    public static int ClearIBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(UpdateIthBit(10, 2, 0));
    }
}
