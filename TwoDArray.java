import java.util.*;
public class TwoDArray{
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
        for (int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print((arr[i][j])+ " ");
            }
        
        System.out.println();
        }
    }
    
}
/*
2
3
1 2 3 4 5 6
1 2 3
4 5 6
 */
