import java.util.*;
public class MissingValue_CountArray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        Arrays.sort(arr);
        int max=arr[n-1];
        int c[]=new int[max+1];
        for(int i=0;i<n;i++)
        c[arr[i]]++;
        System.out.println(Arrays.toString(c));
        for(int i=0;i<max+1;i++){
            if(c[i]==0)
            System.out.print(i+" ");
        }

    }
}
/*
 5
1 1 0 0 3
[2, 2, 0, 1]
2 
 */
