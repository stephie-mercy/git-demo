package git-demo;
//to find odd or even java program
import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.lang.*;
public class odd {
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    if(n%2==0)
    {
        System.out.println("The number is even");
    }
    else
    {
        System.out.println("The number is odd");
    }    
}
