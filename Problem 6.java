/*
Sum square difference
Problem 6
The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of 
the first ten natural numbers and the square of the sum is 3025 ? 385 = 2640.

Find the difference between the sum of the squares of the first 
one hundred natural numbers and the square of the sum.
*/ 


public class Main {

  
    public static void main(String[] args) {
         long sum=0;
         long sumOfN=0;
         for(int i=1;i<=100;i++)
         {
             sum+=i*i;
             sumOfN+=i;
         }
         sumOfN*=sumOfN;
         
         System.out.println(sumOfN-sum);
        
    }
    
}
