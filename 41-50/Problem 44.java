
import java.util.*;

 
public class MainP44 {
 
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(26754);
        for (int i = 1; i < 26753; i++) {
            int x=(i*(3*i-1))/2;
            arr.add(x);
        }
       
        HashSet <Integer> set=new HashSet(arr);
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            int x=arr.get(i);
            for (int j = 1; j < arr.size(); j++) {
                 int y=arr.get(j);
                 int sum=x+y;
                 int dif=y-x;
                 if(set.contains(dif) && set.contains(sum) )
                 {
                    if(dif < min)
                    {
                        min=dif;
                    }
                 }
                
            }
        }
        System.out.println(min);
        
    }
    
}
