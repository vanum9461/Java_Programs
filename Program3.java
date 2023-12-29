//Program to find ASCII value of a character.
import java.io.*;
import java.util.*;

class Program3{
    public static void main(String args[])throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch=sc.next().charAt(0);
        int p=ch;
        System.out.println("Ascii code of: "+ch+" is "+p);
        sc.close();
    }
}