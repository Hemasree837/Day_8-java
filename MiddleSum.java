import java.util.Arrays;
import java.util.Scanner;

public class MiddleSum {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ns[]=new int[n];
        int k=0,s=0;
        for(int i=1;i<=n;i++)
        {
            s+=i;
            ns[k]=s;
            k++;
        }
        System.out.println(Arrays.toString(ns));
        System.out.println(ns[n/2]);
    }
}
/*
 *6
[1, 3, 6, 10, 15, 21]
20
[1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 78, 91, 105, 120, 136, 153, 171, 190, 210]
66
 */

