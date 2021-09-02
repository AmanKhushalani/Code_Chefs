//  Question Link = https://www.codechef.com/problems/LUCKFOUR

import java.util.Scanner;

class Lucky_Four {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        long testCase = sc.nextLong();
        
        while(testCase>0)
        {
            long num = sc.nextLong();
            int counter = 0;
            for(;num>0;num/=10)
            {
                if(num%10 == 4)
                    counter++;
            }

            System.out.println(counter);

            testCase--;
        }


        sc.close();

    }
}