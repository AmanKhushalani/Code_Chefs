//  Question Link = https://www.codechef.com/problems/CHOPRT

import java.util.Scanner;

public class Chef_and_Operator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long testCase = sc.nextLong();

        while(testCase > 0)
        {
            long A = sc.nextLong();
            long B = sc.nextLong();

            if(A>B)System.out.println(">");
            else if(A<B)System.out.println("<");
            else System.out.println("=");

            testCase--;
        }

        sc.close();
        
    }
    
}
