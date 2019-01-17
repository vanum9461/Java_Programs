import java.util.*;
import java.io.*;

class Input{
    public static void main(String args[]){
        Geeks i=new Geeks();
        i.IOfunc();
    }
}

class Geeks{
    static void IOfunc(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int a=sc.nextInt();
            float b=sc.nextFloat();
            long c=sc.nextLong();
            byte d=sc.nextByte();
            sc.nextLine();
            String s=sc.nextLine();
            System.out.print("Inputs are-\n");
            System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+s);
        t-=1;
        }

    }
}