import java.io.*;
import java.util.*;

class Precision{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t>0){
            float a=sc.nextFloat();
            float b=sc.nextFloat();

            Geeks i=new Geeks();
            i.printInFormat(a,b);
            t-=1;
        }
    }
}

class Geeks{
    static void printInFormat(float a,float b){
        float c=a/b;
        System.out.print(c+" ");
        System.out.printf("%.3f\n",c);
    }
}