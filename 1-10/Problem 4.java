/* Problem 4 
Largest palindrome product


A palindromic number reads the same both ways. 
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.

*/

public class Problem4 {

  
    public static void main(String[] args) {
       int max=0;
       int n=0;
        
        
        for(int i=100;i<999;i++)
           for(int j=100;j<999;j++)
           {
               n=i*j;
               if(isPolindromic(n))
                   if(max<n)
                       max=n;
           }
        
        System.out.println(max);
    }
    
    public static boolean isPolindromic(int n)
    {
        String str1,str2;
        StringBuilder db1 =new StringBuilder(Integer.toString(n));
        StringBuilder db2 =new StringBuilder(Integer.toString(n)).reverse();
       
        if(db1.toString().equals(db2.toString()))
        {
            return true;
        }
        return false;
    }
}
 
