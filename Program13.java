import java.io.*;
import java.util.*;

class Program13{
    public static void main(String args[])throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=2*n+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=((4*n)+2);j+=1){
                if(j<t){
                    if(j<=(t-(i*2)) && j%2!=0){
                        System.out.print('*');
                    }
                    else System.out.print(' ');
                }
                else{
                    if(j>=(t+(i*2)) && j%2!=0){
                        System.out.print('*');
                    }
                    else System.out.print(' ');

                }

            }
            System.out.println();
        }
        int q=n+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=((4*n)+2);j+=1){
                if(j<t){
                    if(j<=(t-(2*(q-i))) && j%2!=0){
                        System.out.print('*');
                    }
                    else System.out.print(' ');
                }
                else{
                    if(j>=(t+(2*(q-i))) && j%2!=0){
                        System.out.print('*');
                    }
                    else System.out.print(' ');

                }

            }
            System.out.println();
        }
        sc.close();
    }
}

/*

5
* * * * *   * * * * *
* * * *       * * * *
* * *           * * *
* *               * *
*                   *
*                   *
* *               * *
* * *           * * *
* * * *       * * * *
* * * * *   * * * * *

*/