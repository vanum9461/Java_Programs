//Check whether character entered is vowel or consonant.
import java.io.*;
import java.util.Scanner;

class Program1{
    public static void main(String args[])throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch=sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println(ch+" is a Vowel");
        }
        else{
            System.out.println(ch+" is a Consonant");
        }
        
        sc.close();
    }
}