package problem35;

import java.util.*;
 
 /*
 The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and 719, are themselves prime.

There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.

How many circular primes are there below one million?
 */
public class Problem35 {

    public static void main(String[] args){
       Primes p=new Primes();
       p.fillSieve();
       int arr[];
       ArrayList<Integer> allPrimes=new ArrayList<Integer>();
       for(int i=0;i<1000000;i++)
           if(p.primes[i])
               allPrimes.add(i);
    
       
       TreeSet<Integer> circularPrimes=new TreeSet<Integer>();
       boolean all=false;
       
       for(int i=0;i<allPrimes.size();i++){
           arr=rotateNumber(allPrimes.get(i));
           if(checkPrimes(arr,p))
               circularPrimes.add(allPrimes.get(i));
       }
       
       System.out.println(circularPrimes.size());
       
       
    }
    private static boolean checkPrimes(int arr[],Primes p)
    {
        for(int i=0; i < arr.length ; i++)
        {
            if(!p.isPrime(arr[i]))
                return false;
        }
        return true;
    }
    
    
      private static int[] rotateNumber(int n){
       char c[]=Integer.toString(n).toCharArray();
       int [] arr=new int[c.length-1];
       for(int i=0;i<c.length-1;i++){
           char q=c[0];
          for(int j=0;j<c.length-1;j++)
          {
            c[j]=c[j+1];
          }
            c[c.length-1]=q;
            arr[i]=new Integer(new String(c));
       }
       
       return arr;
    }
}
     
    
    




class Primes {
    boolean[] primes=new boolean[1000000]; 
//set up the primesieve
public void fillSieve() {
    Arrays.fill(primes,true);       
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