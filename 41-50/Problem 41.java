package p41;
import java.util.*;
/*

We shall say that an n-digit number is pandigital if it makes
 use of all the digits 1 to n exactly once. 
For example, 2143 is a 4-digit pandigital and is also prime.

What is the largest n-digit pandigital prime that exists?

*/


public class P41 {
  
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int c=0;
        TreeSet<Integer> t=new TreeSet<>();
        while(P41Utility.nextPermutation(arr)){
             t.add(toInteger(arr));
        }
        int result=0;
        Iterator iter=t.descendingIterator();
        while(iter.hasNext())
        {
           result=  (int) iter.next();
           if(P41Utility.isPrime(result)){
               System.out.println(result);
               break;
           }
        }
      
    }
    
    
    public static int toInteger(int arr[]){
      String str="";
      for(int i=0;i<arr.length;i++)
          str+=arr[i];
      return new Integer(str);
    }
}
 
 class P41Utility {
        
  public static boolean nextPermutation(int[] array) {
    int i = array.length - 1;
    while (i > 0 && array[i - 1] >= array[i])
        i--;
    if (i <= 0)
        return false;

    int j = array.length - 1;
    while (array[j] <= array[i - 1])
        j--;

    int temp = array[i - 1];
    array[i - 1] = array[j];
    array[j] = temp;
    
    j = array.length - 1;
    while (i < j) {
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        i++;
        j--;
    }

    return true;
}
 
    public static boolean isPrime(long n) {
    if (n <= 3) {
        return n > 1;
    } else if (n % 2 == 0 || n % 3 == 0) {
        return false;
    } else {
        double sqrtN = Math.floor(Math.sqrt(n));
        for (int i = 5; i <= sqrtN; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}

}


 