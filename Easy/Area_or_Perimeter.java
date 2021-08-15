// Question Link = https://www.codechef.com/problems/AREAPERI
import java.util.Scanner;
public class Area_or_Perimeter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int B = sc.nextInt();

        if( (L*B) > (2*(L+B)) )
            System.out.println("Area\n"+(L*B));

        else if( (L*B) < (2*(L+B)) )
            System.out.println("Peri\n"+(2*(L+B)));

        else
            System.out.println("Eq\n"+(L*B));


        sc.close();
        
    }

    
}
