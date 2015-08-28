
import java.util.HashSet;

 
public class MainP40 {
 
    public static void main(String[] args) {
         int result=1;
         int index=0;
         StringBuilder bd=new StringBuilder("");
         for(int i=1 ; bd.length() <=1000000 ; i++){
              bd.append(String.valueOf(i));
         }
         index=1;
         for (int i = 1; i < 7; i++) {
            result*=Integer.valueOf(String.valueOf(bd.charAt(index-1)));
            index*=10;
        }
         System.out.println(result);
    }
    
}
