// Question Link = https://www.codechef.com/problems/TWOVSTEN
import java.util.Scanner;

public class Two_vs_Ten {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        while(testCase>0)
        {
            int N = sc.nextInt();
            if(N%10 == 0)
                System.out.println(0);
            else if(N%5 != 0)
                System.out.println(-1);
            else
                System.out.println(1);

            testCase--;
        }

        sc.close();
        
    }
    
}
