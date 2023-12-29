import java.io.*;
import java.util.*;

class SwapElements{
    static void Swap(int a[],int n){
        int i=0,temp;
        while(i+2<n){
            temp=a[i];
            a[i]=a[i+2];
            a[i+2]=temp;
            i+=1;
        }
        for(i=0;i<n;i++)
        System.out.print(a[i]+" ");
        System.out.println();
    } 

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

            Swap(a,n);
            t-=1;
        }
    }
}