public class DiamondPattern{
    public static void main(String[] args){
        int n=3;
        for(int i=-n+1;i<n;i++){
            int spaces=Math.abs(i);
            int stars=2*(n- spaces)-1;
            System.out.print(" ".repeat(spaces));
            System.out.println("*".repeat(stars));
        }
    }
    
}
