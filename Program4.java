//Program to find number of digits in an integer.
import java.io.*;
import java.util.*;

class Program4{
    public static void main(String args[])throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int num1=num;
        int count=0;
        while(num!=0){
            count+=1;
            num/=10;
        }
        System.out.println("Number of digits in "+num1+" is "+count);
        sc.close();
    }
}