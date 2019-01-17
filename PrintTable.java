import java.io.*;
import java.util.*;

class PrintTable{
    static void multiply(int n){
        int m=10;
        while(m>0){
            System.out.print(n*m+" ");
            m-=1;
        }
         System.out.println();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            multiply(n);
            t-=1;
        }
    }
}