// Question Link = https://www.codechef.com/problems/ADASCOOL

import java.util.Scanner;

public class Ada_School {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        while(testCase>0)
        {
            int N = sc.nextInt();
            int M = sc.nextInt();

            if(N%2!=0 && M%2!=0)
                System.out.println("NO");
            else
                System.out.println("YES");

            testCase--;
        }

        sc.close();
        
    }
    
}
