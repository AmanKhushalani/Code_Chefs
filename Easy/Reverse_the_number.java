/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Reverse_the_number
{
	public static void main (String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while(testCase>0)
        {
            int num = sc.nextInt();
            int answer = 0;
            while(num>0)
            {
                answer = (answer*10) + (num%10);
                num/=10;
            }
            System.out.println(answer);
            testCase--;
        }
        sc.close();
	}
}
