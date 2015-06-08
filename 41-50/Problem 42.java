
import java.io.*;
import java.util.*;
/*
The nth term of the sequence of triangle numbers is given by, 
tn = ?n(n+1); so the first ten triangle numbers are:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

By converting each letter in a word to a number corresponding
to its alphabetical position and adding these values we form a word value. 
For example, the word value for SKY is 19 + 11 + 25 = 55 = t10. 
If the word value is a triangle number then we shall call the word a triangle word.

Using words.txt (right click and 'Save Link/Target As...'), 
a 16K text file containing nearly two-thousand common English words, how many are triangle words?

*/


public class Main {
    public static void main(String [] argv) throws FileNotFoundException {


        TreeMap<String,Integer> m=new TreeMap<>();
        char c='a';
        for(int i=0;i<26;i++,c++){
             m.put(Character.toString(c),i+1);
        }
        //System.out.println(m);
        ArrayList<String> words=new ArrayList<>();
        //read the file with words
        Scanner sc=new Scanner(new FileReader("C:\\Users\\Freddy\\IdeaProjects\\P42\\src\\words.txt"));
        String str=sc.nextLine();
        String sArr[]=str.split(",");

        // and words in the ArrayList
        for(int i=0;i<sArr.length;i++)
           words.add(sArr[i].substring(1,sArr[i].length()-1));

        // System.out.println(words);
        ArrayList<Float> result=new ArrayList<>();
        int count=0;
        for(int i=0;i<words.size();i++){
            String str2=words.get(i);
            str2=str2.toLowerCase();
            String a[]=str2.split("");
            float sum=0;
            for(int j=0;j<a.length;j++)
            {
                sum+=m.get(a[j]);
            }
            result.add(sum);
        }


        ArrayList<Float> r2=new ArrayList<>();
        for(int i=1;i<10000;i++)
        {   int n2=i;
            r2.add((float)1/2*i*(n2+1));
        }

        result.retainAll(r2);
        
        System.out.println(result.size());




    }
}
