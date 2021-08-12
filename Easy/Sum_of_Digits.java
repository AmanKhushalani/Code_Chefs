// QUestion link = https://www.codechef.com/problems/FLOW006
import java.util.Scanner;

class Sum_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        while(testCase>0)
        {
            int num = sc.nextInt();
            int sum = 0;
            while(num>0)
            {
                sum += (num%10);
                num/=10;
            }
            System.out.println(sum);

            testCase--;
        }
        sc.close();
    }
}