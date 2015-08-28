
import java.math.BigInteger;

 
public class MainP48 {
 
    public static void main(String[] args) {
      BigInteger e=new BigInteger("1");
      BigInteger result=new BigInteger("0");
        for (int i = 1; i < 1000; i++) {
            e=BigInteger.valueOf(i);
            BigInteger temp=e.pow(i);
            result=result.add(temp);
        }
      String r=result.toString();
      System.out.println(r.substring(r.length()-10));
      
    }
    
}
