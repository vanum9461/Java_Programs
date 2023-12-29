import java.util.*;
import java.io.*;

class CountEvenOdd{
    static void count(int a[],int n){
        int c=0,d=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0)c+=1;
            else d+=1;
            
        }
        System.out.println("Even:"+c+"\n"+"Odd:"+d);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

            count(a,n);
            t-=1;

        }
    }
}