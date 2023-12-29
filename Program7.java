//Sum of digits of a number
import java.io.*;
import java.util.*;

class Program7{
    public static void main(String args[])throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int num1=num;
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        System.out.println("Sum of digits of a number "+num1+" is "+sum);
        sc.close();
    }
}