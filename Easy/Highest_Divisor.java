//  Question link = https://www.codechef.com/problems/HDIVISR

import java.util.Scanner;

public class Highest_Divisor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int i = 10;
        while(i>0)
        {
            if(N%i==0)
            {
                System.out.println(i);
                break;
            }
            i--;
        }
        sc.close();        
    }
    
}
