//Check Strong Number or not
import java.io.*;
import java.util.*;

class Program10{
    public static int fact(int num){
        int f=1;
        for(int i=1;i<=num;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String args[])throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int s=0;
        int p=n;
        while(n!=0){
            int r=n%10;
            s+=fact(r);
            n/=10;
        }
        if(s==p)System.out.println("It is a strong number");
        else System.out.println("Not a strong number");
        sc.close();
    }
}