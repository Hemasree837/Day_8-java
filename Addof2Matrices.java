import java.util.Scanner;

public class Addof2Matrices{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for (int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int arr2[][]=new int[r][c];
        for (int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print((arr[i][j])+ arr2[i][j]+" ");
            }
        
        System.out.println();
        }
    }
}
/*
 * 2
2
3 4 7 8 
2
2
1 3 5 7
4 7   
12 15
 */
