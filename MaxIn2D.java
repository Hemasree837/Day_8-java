import java.util.*;

public class MaxIn2D {
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
        int max=arr[0][0];
        for (int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(arr[i][j]> max)
                    max=arr[i][j];
                
            }
        }
        System.out.println(max);
        
    }
}
/*
 3 
3
1 2 3 4 5 6 7 8 9
9
 */