 
public class MainP30 {
 
    public static void main(String[] args) {
        P30 p=new P30();
        int sum=0,n=0;
        int totalSum=0;
        for (int i = 10; i < 500000; i++) {
            n=i;
            int a[]=p.numberToArray(n);
            sum=0;
            for (int j = 0; j < a.length; j++) {
                sum+=Math.pow(a[j], 5);
            }
            if(sum==n){
                totalSum+=n;
            }
        }
        
        System.out.println(totalSum);
        
    }
    
}

class P30
{
    public int[] numberToArray(int n){
        String s[]=(n+"").split("");
        int a[]=new int[s.length];
        for(int i=0; i < s.length; i++){
            a[i]=Integer.parseInt(s[i]);
        }
        return a;
    }
}
