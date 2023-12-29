import java.io.*;
import java.util.*;

class Isomorphism{
    static boolean check(String s1,String s2){
        int l1=s1.length();
        int l2=s2.length();
        if(l1!=l2)return false;
        Boolean mark[]=new Boolean[256];
        Arrays.fill(mark,Boolean.FALSE);

        int map[]=new int[256];
        Arrays.fill(map,-1);

        for(int i=0;i<l2;i++){
            if(map[s1.charAt(i)]==-1){
                if(mark[s2.charAt(i)]==true)return false;

                mark[s2.charAt(i)]=true;

                map[s1.charAt(i)]=s2.charAt(i);
            }
            else if(map[s1.charAt(i)]!=s2.charAt(i))return false;

        }
        return true;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        String sar[]=s.split(" ");
        String p=sar[0];
	    String q=sar[1];

        boolean ans=check(p,q);
        if(ans==true)System.out.println("Yes");
        else System.out.println("No");
    }
}