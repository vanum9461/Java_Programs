import java.io.*;
import java.util.*;

class LogicalOperators{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            boolean a=sc.nextBoolean();
            boolean b=sc.nextBoolean();

            Geeks i=new Geeks();
            i.logicOp(a,b);
            t-=1;
        }

    }
}

class Geeks{
    static void logicOp(boolean a,boolean b){
        System.out.println((a&&b)+" "+(a||b)+" "+((!a)&&(!b)));
    }
}