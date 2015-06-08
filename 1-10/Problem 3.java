/* Problem 3  Largest prime factor
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

*/

 
package problem3;

import java.util.Arrays;

 
public class Problem3 {
 
    public static void main(String[] args) {
       Primes p=new Primes ();
       p.fillSieve();
       long n=600851475143L;
       int maxPrime=0;
       for(int i=775146; i > 2;i--){
           if(n%i == 0 && p.isPrime(i))
           {
               maxPrime=i;
               break;
           }
       }
       System.out.println(maxPrime);
    }
    
}



class Primes {
    boolean[] primes=new boolean[775146]; 
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