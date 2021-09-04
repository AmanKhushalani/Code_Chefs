// Question Link = https://www.codechef.com/problems/CIELRCPT

import java.util.Scanner;

class Ciel_and_Receipt {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[12];
        arr[0] = 1;
        for(int i=1 ; i<12 ; i++)
            {arr[i] = arr[i-1]*2;}

        int testCase = sc.nextInt();

        while(testCase>0)
        {
            long num = sc.nextLong();
            int p = 0;
            int counter = 11;

            while(num>0 && counter>=0)
            {
                if(arr[counter] <= num)
                {
                    num -= arr[counter];
                    p++;
                }
                else
                {
                    counter--;
                }
            }
            System.out.println(p);
            testCase--;
        }       
        sc.close();

       
    }
}