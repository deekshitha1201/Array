import java.util.Scanner;
public class Transpose
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      int a=sc.nextInt();
      int b=sc.nextInt();
      int[][] arr=new int[a][b];
      System.out.println("original matrix");
      for(int i=0;i<a;i++)
        {
          for(int j=0;j<b;j++)
            {
              arr[i][j]=sc.nextInt();
            }
        }
      System.out.println("Transpose matrix");
      for(int i=0;i<a;i++)
        {
          for(int j=0;j<b;j++)
            {
              System.out.print(arr[j][i]+" ");
            }
          System.out.println();
        }
    }
  }