// (0-1) Triangle Pattern
public class P2Q5{

    public static void ZeroOneTrianglePattern(int r){
        
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j)%2==0){
                    System.out.print("1"); 
                }
                else{
                    System.out.print("0");
                }                    
            }
            System.out.println(" ");
        }
        
    }
    public static void main(String[] args) {
        
        ZeroOneTrianglePattern(5);
        
    }
}