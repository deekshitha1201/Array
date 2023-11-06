import java.util.Scanner;
public class Secondlargest
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      int a=sc.nextInt();
      int[] arr=new int[a];
      int max;
      System.out.println("enter the elements");
      for(int i=0;i<a;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("second largest element");
      for(int i=0;i<a;i++)
        {
          for(int j=i+1;j<a;j++)
            {
              if(arr[i]>arr[j])
              {
                max=arr[i];
                arr[i]=arr[j];
                arr[j]=max;
              }
            }
        }
      System.out.println(arr[a-2]);
    }
  }