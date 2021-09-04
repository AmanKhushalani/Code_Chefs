// Question link = https://www.codechef.com/problems/DWNLD
import java.util.Scanner;

class Download_file {
    
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        while(testCase>0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int totalCost = 0;
            while(n>0)
            {
                int time = sc.nextInt();
                int speed = sc.nextInt();
                if(k >= time)
                {
                    k -= time;
                    time = 0;
                }
                else if(k < time)
                {
                    time -= k;
                    k=0;
                }

                totalCost += (speed*time);
                n--;
            }
            System.out.println(totalCost);

            testCase--;
        }

        sc.close();        
    }
}