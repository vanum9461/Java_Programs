import java.io.*;
import java.util.*;

class DivisibleByPrime{
    static void isDivisible(int n){
        if(n%11==0)System.out.println("Divisible by 11");
        else if(n%3==0)System.out.println("Divisible by 3");
        else if(n%2==0)System.out.println("Divisible by 2");
        else System.out.println("-1");

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
       
        while(t>0){
             int n=sc.nextInt();
            isDivisible(n);
            t-=1;
        }

    }
}