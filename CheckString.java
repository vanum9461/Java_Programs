import java.util.*;
import java.io.*;

class CheckString{
    static void check(String s){
        int v=0,c=0;
        for(int i=0;i<s.length();i++){
            char p=s.charAt(i);
            if(p!=' '){
                if(p=='a'||p=='e'||p=='o'||p=='u'||p=='i')v+=1;
                else c+=1;
            }
        }
        if(v>c)System.out.print("Yes");
        else if(v<c)System.out.print("No");
        else System.out.print("Same");

        System.out.println();

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            String s=sc.nextLine();
            check(s);
            t-=1;
        }
    }
}