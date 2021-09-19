// Question Link :- https://www.codechef.com/problems/MISSP
import java.util.Scanner;
import java.util.Vector;

public class Chef_and_Dolls {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();

        Vector<Integer> vec = new Vector<Integer>();
        while(testCase>0)
        {
            int size = sc.nextInt(), var;
            for(int i=0 ; i<size ; i++)
            {
                var = sc.nextInt();
                if(vec.size() > 0 && vec.contains(var))
                {
                    vec.removeElement(var);
                }
                else
                {
                    vec.add(var);
                }
            }

            for(int i=0 ; i<vec.size() ; i++)
                System.out.print(vec.elementAt(i)+" ");
            System.out.println();

            vec.clear();

            testCase--;
        }


        sc.close();
        
    }
    
}
