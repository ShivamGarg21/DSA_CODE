import java.util.ArrayList;
import java.util.Scanner;
public class day2{
        public static Scanner scn = new Scanner(System.in);

        public static ArrayList<String> subseq(String str)
        {
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            for(int i=0;i<str.length();i++)
            {
                   char ch = str.charAt(i);
                  int size = ans.size(); 
                  for(int j=0 ; j<size; j++)
                      ans.add(ans.get(j)+ch);
            }
            return ans;
        }
        public static void main(String[] args)
        {
                String str = scn.nextLine();
                System.out.println(subseq(str));
                
        }
}