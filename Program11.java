//Perfect number or not
import java.io.*;
import java.util.*;

class Program11{

    public static void main(String args[])throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0)sum+=i;
        }
       
        if(sum==num)System.out.println("Perfect number");
        else System.out.println("Not a perfect number");
        
        sc.close();
    }
}