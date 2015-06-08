
import java.util.Arrays;
/*
A permutation is an ordered arrangement of objects.
 For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4.
 If all of the permutations are listed numerically or alphabetically, we call it lexicographic order. 
 The lexicographic permutations of 0, 1 and 2 are:

012   021   102   120   201   210

What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
*/


public class Problem24 {
 
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6,7,8,9};
        for(int i=1;i<1000000;i++)
         nextPermutation(arr);
       
        
        String result="";
        for(int x : arr)
            result+=x;
         System.out.println(result);
        
   }//main
   
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

}
   