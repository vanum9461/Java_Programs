import java.util.Scanner;
import java.util.ArrayList;

class Pattern{
  
  static String stars(String s,int repeat){
    String s1="";
    for(int i=0;i<repeat;i++)s1+=s;
    return s1;
  }
    
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    ArrayList<String> pat=new ArrayList<>();
    for(int i=0;i<n;i++)pat.add("");
    int incr=0;
    for(int i=0;i<n;i++){
      pat.set(i,pat.get(i)+stars("**",i));
      for(int j=0;j<n-i;j++){
        incr+=10;
        pat.set(i,pat.get(i)+incr);
      }
    }
    
      for(int i=n-1;i>=0;i--){
        for(int j=0;j<n-i;j++){
          incr+=10;
          pat.set(i,pat.get(i)+incr);
        }
      }
    for(String s:pat){
      System.out.println(s.substring(0,s.length()-1));
    }
  }
}