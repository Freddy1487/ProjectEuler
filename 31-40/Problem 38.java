package p38;
 
import java.util.*;
/*
Take the number 192 and multiply it by each of 1, 2, and 3:

192 × 1 = 192
192 × 2 = 384
192 × 3 = 576
By concatenating each product we get the 1 to 9 pandigital, 192384576.
 We will call 192384576 the concatenated product of 192 and (1,2,3)

The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5, 
giving the pandigital, 918273645, which is the concatenated product of 9 and (1,2,3,4,5).

What is the largest 1 to 9 pandigital 9-digit number that can be formed as the concatenated product 
of an integer with (1,2, ... , n) where n > 1?
*/


public class P38 {
 
    public static void main(String[] args) {
        P38U u=new P38U();
        ArrayList<Integer> arr=new ArrayList<>();
      
        for(int n=2; n < 10000 ;n++){
         String nStr="";
            for(int i=1; i<5 ;i++){
              int x=n*i;
              if((nStr+""+x).length()<=9)
                 nStr=nStr+""+x;
              else
                 break;
            }
          arr.add(Integer.parseInt(nStr));
        }
        
        //////////////////////////////
        for(int i=0;i<arr.size();i++){
            if(!(u.isPandigital(arr.get(i)))){
                arr.remove(i);
                i--;
            }
        }
        System.out.println(Collections.max(arr) );
        
    }
    
}

class P38U  
{
    public boolean isPandigital(int n)
    {
        String s[]=(n+"").split("");
        TreeSet<Integer> a=new TreeSet<>();
        a.add(0);
        for(int i=0;i<s.length;i++)
        {
            if(a.contains(Integer.parseInt(s[i]))  )
                return false;
            a.add(Integer.parseInt(s[i]));
            
        }
        return true;
    }
    
}