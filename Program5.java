//Program to find factorial.
import java.io.*;
import java.util.*;

class Program5{
    public static void main(String args[])throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++)fact=fact*i;
        System.out.println("The factorial of "+num+" is "+fact);
        sc.close();
    }
}