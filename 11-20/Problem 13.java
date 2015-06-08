/* 
Problem 13

Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
*/



import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;

 
public class P13 {

     
    public static void main(String[] args) throws FileNotFoundException, IOException {
         ArrayList<String> arr=readNumbers();
         BigInteger bint=new BigInteger("0");
         for(int i=0;i<arr.size();i++){
             bint=bint.add(new BigInteger(arr.get(i)));
         }
         System.out.println(new String(bint.toString()).substring(0,10));
    }
    public static ArrayList readNumbers() throws FileNotFoundException, IOException{
        BufferedReader rd=new BufferedReader(new FileReader("C:\\Users\\Freddy\\Documents\\NetBeansProjects\\P13\\src\\p13\\numbers.txt"));
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0; rd.ready();i++)
            arr.add(rd.readLine());
        return arr;
    }
}
