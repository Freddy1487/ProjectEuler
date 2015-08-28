
import java.util.*;

 
public class MainP45 {
 
    public static void main(String[] args) {
      HashSet<Long> T=new HashSet<>();
      HashSet<Long> P=new HashSet<>();
      HashSet<Long> H=new HashSet<>();
      
      long t=0,p=0,h=0,n=0;
      for(int i=1;i<1000000;i++){
          n=i;
          t=n*(n+1)/2;
          p=n*(3*n-1)/2;
          h=n*(2*n-1);
          T.add(t);
          P.add(p);
          H.add(h);
      }
       
      T.retainAll(P);
      T.retainAll(H);
      System.out.println(T);
      
    }
    
}
