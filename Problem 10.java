
import java.util.Arrays;

/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/
public class Main {
 
    public static void main(String[] args) {
        Primes p=new Primes();
        p.fillSieve();
        long sum=0;
        for(int i=0;i<2000000;i++){
            if(p.isPrime(i)){
                sum+=i;
            }
        }
        
        System.out.println(sum);
    }
    
}




class Primes {
    boolean[] primes=new boolean[2000000]; 
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