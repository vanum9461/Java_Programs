import java.io.*;
import java.util.*;
// count the number of elements which occurs 
//exactly floor(N/K) times in the array.
class CountSpecials{
    static void count(int a[],int n,int k){
        int f = (int)Math.floor(n/k);
        final int max=1001;
        int c=0;
        int freq[]=new int[max];
        for(int i=0;i<n;i++)freq[a[i]]++;
        for(int i=0;i<max;i++){
            if(freq[i]==f)c++;
        }
        System.out.println(c);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];

            for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

            count(a,n,k);
            t-=1;
        }
    }
}