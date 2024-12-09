import java.util.*;
class SumOfnaturalNumbers
{
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
    }
}
/*
 5
[1, 3, 6, 10, 15]
 */