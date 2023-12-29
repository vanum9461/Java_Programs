//Power of a number
import java.io.*;
import java.util.*;

class Program12{
    public static void main(String args[])throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number and power to calculate: ");
        int num=sc.nextInt();
        int power=sc.nextInt();
        int f=1;
        for(int i=1;i<=power;i++){
            f=f*num;
        }
        System.out.println(f);
        sc.close();
    }
}