
import java.util.Arrays;

 /*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
*/
public class Main {
 
    public static void main(String[] args) {
        Primes p=new Primes();
        p.fillSieve();
        int j=0;
        int i=0;
        for(;i<p.primes.length;i++)
        {
            if(p.isPrime(i))
                j++;
            if(j==10001){
               System.out.println(i);
               break;
            }
        }
            
    }//main method
}//Main class



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