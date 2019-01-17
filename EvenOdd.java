import java.io.*;
import java.util.*;

class EvenOdd{
    static void check(int a,int b){
        if(a%2==0){
            System.out.println(a+"\n"+b);
        }
        else{
            System.out.println(b+"\n"+a);
        }

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int t=sc.nextInt();
        while(t>0){
            check(a,b);
            t-=1;
        }
        
    }
}