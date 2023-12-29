import java.io.*;
import java.util.*;

class Program15{
    public static void main(String args[])throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=i){
                    System.out.print('*');
                    System.out.print(' ');
                }
                else  System.out.print(' ');
                
            }
            System.out.println();
        }
        sc.close();
    }
}

/* 

5
*
* *
* * *
* * * *
* * * * *

*/