package p39;

import java.util.*;
 

/*
Integer right triangles
Problem 39
If p is the perimeter of a right angle triangle with integral length sides,
{a,b,c}, there are exactly three solutions for p = 120.

{20,48,52}, {24,45,51}, {30,40,50}

For which value of p ? 1000, is the number of solutions maximised?
*/

public class P39 {
    public static void main(String[] args) {
        int a,b,c,p;
        Map <Integer,Integer> m=new TreeMap<>();
        for(c=3;c<1000;c++)
            for(b=2;b < c; b++)
                for(a=1; a < b ;a++)
                {
                   
                    if(c*c == (a*a+b*b) && a+b+c <1000)
                    {
                       p=a+b+c;
                       Integer freq = m.get(p);
                       m.put(p, (freq == null) ? 1 : freq + 1);
                    }
                }
         Set <Integer> keys=m.keySet();
         int n=1;
         int max=1;
         Iterator iter=keys.iterator();
         while(iter.hasNext()){
            Integer x=(Integer) iter.next();
            Integer get = m.get(x);
            if(max < get){
                max=get;
                n=x;
            }
                
         }
         System.out.println(n);
        
    }
}
 