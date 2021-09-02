// Question link = https://www.codechef.com/problems/CCOOK


import java.util.Scanner;

public class Chef_and_Cook_Off {


    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        int testCase = sc.nextInt();

        String arr[] = new String[6];
        arr[0] = "Beginner";
        arr[1] = "Junior Developer";
        arr[2] = "Middle Developer";
        arr[3] = "Senior Developer";
        arr[4] = "Hacker";
        arr[5] = "Jeff Dean";


        while(testCase>0)
        {
            int sum = 0;
            for(int i=0;i<5;i++)
            {
                int temp = sc.nextInt();
                sum += temp;
            }
            System.out.println(arr[sum]);

            testCase--;
        }

        sc.close();

        
    }
    
}