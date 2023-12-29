import java.io.*;
import java.util.*;

class CountLRUCache{
    static int count(int max_cachesize,int frames[],int f_size){
        LinkedList<Integer> arr=new LinkedList<>();
        int c=0;
        if(f_size!=0){
            for(int i=0;i<max_cachesize;i++){
                c+=1;
                arr.add(frames[i]);
            }
        }
        else return 0;
        int temp,j;
        for(int i=0;i<frames.length;i++){
            if(arr.contains(frames[i])){
                temp=frames[i];
                j=arr.indexOf(temp);
                arr.remove(j);
                arr.addLast(temp);
            }
            else{
                c+=1;
                temp=frames[i];
                arr.removeFirst();
                arr.addLast(temp);
            }
        }
        return c;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int cache_size=sc.nextInt();
        int p_size=sc.nextInt();
        int pages[]=new int[p_size];

        for(int i=0;i<p_size;i++)
        pages[i]=sc.nextInt();

        int ans=count(cache_size,pages,p_size);
        System.out.println(ans);
    }
}