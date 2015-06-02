 
package p36;

 
public class P36 {
 
    public static void main(String[] args) {
         
        long sum=0;
         for (int i = 1; i < 1000000; i++) {
             if(isPalindromic(i+"") && isPalindromic(Integer.toString(i, 2))) 
                 sum+=i;
        }
         System.out.println(sum);
        
    }
    public static boolean isPalindromic(String n){
        for(int i=0;i<n.length()/2;i++){
            if(n.charAt(i)!= n.charAt(n.length()-i-1))
                return false;
        }
        
        return true;
    } 
}
