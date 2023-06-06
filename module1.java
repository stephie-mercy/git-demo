//java program to find the largest number in an array
import java.util.Scanner;
import java.util.*;
public class module1 {
      public static void main(String args[])
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the size of the array");
          int n=sc.nextInt();
          int a[]=new int[n];
          System.out.println("Enter the elements of the array");
          for(int i=0;i<n;i++)
          {
              a[i]=sc.nextInt();
          }
          int max=a[0];
          for(int i=0;i<n;i++)
          {
              if(a[i]>max)
              {
                  max=a[i];
              }
          }
          System.out.println("The largest number in the array is "+max);
      }  
}
