import java.util.ArrayList;
import java.util.Arrays;

/**
 * Problem 37
 The number 3797 has an interesting property. Being prime itself, 
 it is possible to continuously remove digits from left to right, 
 and remain prime at each stage: 3797, 797, 97, and 7. 
 Similarly we can work from right to left: 3797, 379, 37, and 3.

 Find the sum of the only eleven primes that are both truncatable from left to right and right to left.

 NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.
 */
public class P37Main
{

    public static void main(String [] argv){
        Primes p=new Primes();
        p.fillSieve();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=10;i<1000000;i++)
            if(p.isPrime(i))
                arr.add(i);

        p37 z=new p37();
        int sum=0,count=0;
        for(int i=0; i < arr.size() && count < 11; i++ ){
            if(z.isTruncatablePrime(arr.get(i),p))
            {
                sum+=arr.get(i);
                count++;
            }
        }

        System.out.println(sum);
    }
}


class p37 {
    public boolean isTruncatablePrime(int n,Primes p){
        if(leftToRight(n,p) && rightToLeft(n,p))
            return true;
        return false;
    }

    private boolean leftToRight(int n,Primes p)
    {
        String str=n+"";
        for(int i=0;i<str.length();i++){
            if(!p.isPrime(new Integer(str.substring(i))))
                return false;
        }
        return true;
    }

    private boolean rightToLeft(int n,Primes p)
    {
        String str=n+"";
        for(int i=0;i<str.length();i++){
            if(!p.isPrime(new Integer(str.substring(0,str.length()-i))))
                return false;
        }
        return true;
    }
}




class Primes {
    boolean[] primes=new boolean[1000000];
    //set up the primesieve
    public void fillSieve() {
        Arrays.fill(primes, true);
        primes[0]=primes[1]=false;
        for (int i=2;i<primes.length;i++) {
            if(primes[i]) {
                for (int j=2;i*j<primes.length;j++) {
                    primes[i*j]=false;
                }
            }
        }
    }

    public boolean isPrime(int n) {
        return primes[n];
    }

}