/* package codechef; // don't place package name! */

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        int testCase;
        Scanner sc = new Scanner(System.in);
        testCase = sc.nextInt();
        while(testCase>0)
        {
            int size = sc.nextInt();
            int arr[] = new int[size];
            for(int i=0;i<size;i++)
            {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[0]+arr[1]);            
            testCase--;
        }

        sc.close();
	}
}
