import java.util.*;
public class PowerN{
    public static int XpowerN(int x, int n){
        if(n==1){
            return x;
        }
        
        return x*XpowerN(x, n-1);
    }
    public static void main(String[] args) {
        int a =2;
        int p = 10;
        System.out.println("The power of "+a+"^"+p+" = "+XpowerN(a, p));
    }
}