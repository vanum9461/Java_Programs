import java.io.*;
import java.util.*;

class MinimumSwap{
    static int min(int a[],int n){
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]==1)c+=1;
        }
        int max=0,t;
        for(int i=0;i<n-c;i++){
            t=0;
            for(int j=i;j<(i+c);j++){
                if(a[j]==1)t+=1;
            }
            if(t>max)max=t;
        }
        return (c-max);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

            int c=min(a,n);
            System.out.println(c);

            t-=1;
        }
    } 
}