import java.util.Arrays;
import java.util.Scanner;

public class ThreeIndices {
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
        for(int i=0;i<n;i+=3)
        System.out.print(ns[i]+" ");
    }
}
/*
 *20
[1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 78, 91, 105, 120, 136, 153, 171, 190, 210]
1 10 28 55 91 136 190 
 */
