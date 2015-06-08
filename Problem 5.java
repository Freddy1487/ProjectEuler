/*

2520 is the smallest number that c
an be divided by each of the numbers from 1 to 10 
without any remainder.

What is the smallest positive number
that is evenly divisible by all of the 
numbers from 1 to 20?

*/

public class Main {
   
    public static void main(String[] args) {
        int n=116396280;//2520*11*13*17*19=116396280
        boolean f=false;
        for(int i=116396280; ;i++){
           f = divide(i);
           if(f){
               System.out.println(i);
               break;
           }
        }
    }
    
    private static boolean divide(int n){
         for(int j=11;j<=20;j++)
             {
                 if(n%j !=0) {
                     return false;
                 }
             }
         return true;
    }
    
}
