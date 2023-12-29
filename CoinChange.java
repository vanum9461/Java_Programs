import java.util.*;
class CoinChange{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of coins");
		int n=sc.nextInt();
		int c[]=new int[n];
		for(int i=0;i<n;i++)
			c[i]=sc.nextInt();
		System.out.println("Enter amt to make");
		int amt=sc.nextInt();
		int temp[]=new int[amt+1];
		temp[0]=1;
		for(int j=0;j<n;j++){
			for(int k=1;k<amt+1;k++){
				if(k>=c[j]){
					temp[k]+=temp[k-c[j]];
				}
			}
		}
		System.out.println("Possible ways: "+temp[amt]);
	}
}
	
	