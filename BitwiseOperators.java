import java.io.*;
import java.util.*;

class BitwiseOperators{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            Geeks i=new Geeks();
            i.logicOp(a,b,c);
            t-=1;
        }

    }
}
class Geeks{
    static void logicOp(int a,int b,int c){
        int d = a ^ a;
        System.out.println(d);
        int e = c ^ b;
        System.out.println(e);
        int f = a & b;
        System.out.println(f);   
        int g = c|(a ^ a);
        System.out.println(g); 
        e = ~e;
        System.out.println(e);
    }
}