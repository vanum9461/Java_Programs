//Check whether character is an alphabet or not.
import java.io.*;
import java.util.*;

class Program2{
    public static void main(String args[])throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch=sc.next().charAt(0);
        if((ch>=65 && ch<=90)||(ch>=97 && ch<=122)){
            System.out.println("It is an alphabet");
        }
        else{
            System.out.println(ch+" is not an alphabet");
        }
        sc.close();
    }
}