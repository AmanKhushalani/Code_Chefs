// Question Link = https://www.codechef.com/problems/STRPALIN

import java.util.Arrays;
import java.util.Scanner;

public class Palindromic_substrings {

    public static String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();
 
        // Sorting temp array using
        Arrays.sort(tempArray);
 
        // Returning new sorted string
        return new String(tempArray);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        

        int testCase = sc.nextInt();

        while(testCase>0)
        {
            String s1 = sc.next();
            String s2 = sc.next();
            
            s1 = sortString(s1);
            s2 = sortString(s2);

            int br = 0;
            for(int i=0 ; i<s1.length() ; i++)
            {
                for(int j=0 ; j<s2.length(); j++)
                {
                    if(s1.charAt(i) == s2.charAt(j))
                    {
                        br = 1;
                        break;
                    }
                }
                if(br==1)
                {
                    System.out.println("Yes");
                    break;
                }
            }
            if(br==0)
                System.out.println("No");

            testCase--;
        }

        sc.close();
        
    }
    
}
