import java.io.*;
import java.util.*;

class First{
    public static void main(String args[])throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ar[]=new String[n];

        for(int i=0;i<n;i++){
            ar[i]=sc.nextLine();
            
        }
        for(int i=0;i<n;i++)
        System.out.println(ar[i]);

    }
}