// Question Link = https://www.codechef.com/problems/CLIPLX

import java.util.Scanner;

public class IPL_and_RCB {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        while(testCase>0)
        {

            int pointsNeeded = sc.nextInt();
            int matchesRemaining = sc.nextInt();
            int win = 0;
            while(pointsNeeded>=0)
            {
                if(matchesRemaining >= pointsNeeded)
                    break;
                else
                {
                    win++;
                    matchesRemaining--;
                    pointsNeeded-=2;
                }
            }
            System.out.println(win);
            testCase--;
        }

        sc.close();
        
    }
    
}
