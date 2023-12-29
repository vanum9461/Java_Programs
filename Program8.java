//Reverse of a number
import java.io.*;
import java.util.*;

class Program8{
    public static void main(String args[])throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int rev=0;
        int num1=num;
        while(num1!=0){
            int rem=num1%10;
            rev=rev*10+rem;
            num1/=10;
        }
        System.out.println("Reverse of a number "+num+" is "+rev);
        sc.close();
    }
}