import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        
        int x,n,p=1;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        n=sc.nextInt();
        if(x>=0 && x<=8 && n>=0 && n<=9)
        {
            if(n==0)
            {
                System.out.println("1");
                return;
            }
            
            int i=1;
            
            while(i<=n)
            
            {
                p=p*x;
                i=i+1;
            }
            
            System.out.println(p);
        }
        
    }
}