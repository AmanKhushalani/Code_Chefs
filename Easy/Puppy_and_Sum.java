import java.util.Scanner;

public class Puppy_and_Sum {

    public static int sum(int num)
    {
        int a = 0;
        for(;num>0;num--)
            a+=num;
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        while(testCase>0)
        {
            int D , N;
            D = sc.nextInt();
            N = sc.nextInt();
            while(D>0)
            {
                N = sum(N);
                D--;
            }
            System.out.println(N);
            testCase--;
        }

        sc.close();
        
    }
    
}
