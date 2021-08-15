import java.util.Scanner;

// Question Link = https://www.codechef.com/problems/RECTANGL
class Rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        while(testCase>0){

            int A,B,C,D;
            A = sc.nextInt();
            B = sc.nextInt();
            C = sc.nextInt();
            D = sc.nextInt();
            if(A==B && C==D) System.out.println("YES");
            
            else if(A==C && B==D) System.out.println("YES");

            else if(A==D && C==B) System.out.println("YES");

            else System.out.println("NO");



            testCase--;
        }

        sc.close();

        
    }
}