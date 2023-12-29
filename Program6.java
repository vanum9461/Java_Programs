//Program to find fibonaaci sequence
import java.io.*;
import java.util.*;

class Program6{
    public static void main(String args[])throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int limit=sc.nextInt();
        int a=-1,b=1,c;
        for(int i=0;i<limit;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        sc.close();
    }
}