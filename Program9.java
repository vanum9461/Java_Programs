//LCM of a number
import java.io.*;
import java.util.*;

class Program9{
    public static void main(String args[])throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int lar=Math.max(num1,num2);
        int small=Math.min(num1,num2);
        int i=lar,lcm;
        while(true){
            if(i%small==0){
                lcm=i;
                break;
            }
            i+=lar;
        }
        System.out.println("LCM of "+num1+" and "+num2+" is "+lcm);
        sc.close();
    }
}