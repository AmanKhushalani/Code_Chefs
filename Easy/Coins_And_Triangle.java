// Question Link = https://www.codechef.com/problems/TRICOIN

import java.util.Scanner;

class Coins_And_Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        while(testCase>0)
        {
            int num = sc.nextInt();
            int i;
            for(i=1 ; i<num ; i++ , num -= i){}
            System.out.println(i);
            
            testCase--;
        }

        sc.close();
        
    }
}