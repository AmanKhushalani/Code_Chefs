// Question Link :- https://www.codechef.com/problems/CHEFSTLT

import java.util.Scanner;

class Chef_and_Two_Strings {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        int minimal = 0, maximal = 0;
        while(testCase>0)
        {
            minimal = maximal = 0;
            String s1 = sc.next();
            String s2 = sc.next();

            for(int i=0 ; i<s1.length() ; i++)
            {
                if(s1.charAt(i) == '?' || s2.charAt(i) == '?')
                {
                    maximal++;
                }
                else if(s1.charAt(i) !=  s2.charAt(i))
                {
                    minimal++;
                    maximal++;
                }
            }
            System.out.println(minimal+" "+maximal);

            testCase--;
        }

        sc.close();
        
    }
    
}