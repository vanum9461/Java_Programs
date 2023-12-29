import java.util.*;
import java.io.*;

class MakeAnagram{
    static int make(String s1,String s2){

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            String s1=sc.next();
            String s2=sc.next();

            make(s1,s2);
            t-=1;
        }
    }
}